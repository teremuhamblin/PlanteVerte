package com.planteverte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.planteverte.data.Plant
import com.planteverte.data.PlantDatabase
import com.planteverte.databinding.ActivityPlantWizardBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PlantWizardActivity : AppCompatActivity() {

    private lateinit var b: ActivityPlantWizardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityPlantWizardBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnSavePlant.setOnClickListener {
            val name = b.inputName.text.toString()
            val species = b.inputSpecies.text.toString()

            if (name.isBlank() || species.isBlank()) {
                Toast.makeText(this, "Champs incomplets", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val plant = Plant(name = name, species = species)

            CoroutineScope(Dispatchers.IO).launch {
                PlantDatabase.getInstance(this@PlantWizardActivity)
                    .plantDao()
                    .insert(plant)
            }

            Toast.makeText(this, "Plante ajoutée", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
