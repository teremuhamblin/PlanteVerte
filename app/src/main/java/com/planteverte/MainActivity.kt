package com.planteverte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.planteverte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnAddPlant.setOnClickListener {
            startActivity(Intent(this, PlantWizardActivity::class.java))
        }

        b.btnJournal.setOnClickListener {
            startActivity(Intent(this, JournalActivity::class.java))
        }
    }
}
