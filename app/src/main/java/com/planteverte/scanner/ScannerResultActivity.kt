package com.planteverte.scanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.planteverte.databinding.ActivityScannerResultBinding

class ScannerResultActivity : AppCompatActivity() {

    private lateinit var b: ActivityScannerResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityScannerResultBinding.inflate(layoutInflater)
        setContentView(b.root)

        val plantName = intent.getStringExtra("plantName") ?: "Inconnue"
        val confidence = intent.getStringExtra("confidence") ?: "N/A"
        val details = intent.getStringExtra("details") ?: "Aucune information disponible."

        b.resultTitle.text = plantName
        b.resultConfidence.text = "Confiance : $confidence"
        b.resultDetails.text = details
    }
}
