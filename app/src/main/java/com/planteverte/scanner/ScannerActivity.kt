package com.planteverte.scanner

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.planteverte.data.Plant
import com.planteverte.data.PlantDatabase
import com.planteverte.databinding.ActivityScannerBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ScannerActivity : AppCompatActivity() {

    private lateinit var b: ActivityScannerBinding
    private var bitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityScannerBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnTakePhoto.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 100)
        }

        b.btnAnalyze.setOnClickListener {
            if (bitmap == null) {
                Toast.makeText(this, "Aucune image", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val result = ScannerAnalyzer.analyze(bitmap!!)
            b.resultText.text = "Résultat : $result"

            // Enregistrement dans la base
            CoroutineScope(Dispatchers.IO).launch {
                PlantDatabase.getInstance(this@ScannerActivity)
                    .plantDao()
                    .insert(Plant(name = result, species = "Inconnue"))
            }

            // 👉 TÂCHE 4 : Remplacement du Toast par l'écran détaillé
            val intent = Intent(this, ScannerResultActivity::class.java)
            intent.putExtra("plantName", result)
            intent.putExtra("confidence", "95%")
            intent.putExtra("details", "Analyse préliminaire basée sur la forme, la couleur et la texture des feuilles.")
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 100 && resultCode == Activity.RESULT_OK) {
            bitmap = data?.extras?.get("data") as Bitmap
            b.previewImage.setImageBitmap(bitmap)
        }
    }
}
