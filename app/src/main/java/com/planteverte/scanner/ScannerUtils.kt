package com.planteverte.scanner

import android.graphics.Bitmap

object ScannerUtils {

    fun resize(bitmap: Bitmap, size: Int): Bitmap {
        return Bitmap.createScaledBitmap(bitmap, size, size, true)
    }
}
