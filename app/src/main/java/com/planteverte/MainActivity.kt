package com.planteverte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.planteverte.databinding.ActivityMainBinding
import com.planteverte.scanner.ScannerActivity

class MainActivity : AppCompatActivity() {

    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        // --- Navigation existante ---
        b.btnAddPlant.setOnClickListener {
            startActivity(Intent(this, PlantWizardActivity::class.java))
        }

        b.btnJournal.setOnClickListener {
            startActivity(Intent(this, JournalActivity::class.java))
        }

        // --- TÂCHE 6 : Ajout du module Scanner ---
        b.btnScanner.setOnClickListener {
            startActivity(Intent(this, ScannerActivity::class.java))
        }
    }
}
