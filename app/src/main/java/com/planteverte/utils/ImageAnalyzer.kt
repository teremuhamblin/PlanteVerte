package com.planteverte.utils

import android.graphics.Bitmap
import com.planteverte.data.ScanResult

class ImageAnalyzer {

    fun analyze(bitmap: Bitmap): ScanResult {
        // TODO: passer le bitmap au modèle IA (AiModelLoader)
        return ScanResult(
            plantName = null,
            confidence = 0.0f,
            suggestions = emptyList()
        )
    }
}
