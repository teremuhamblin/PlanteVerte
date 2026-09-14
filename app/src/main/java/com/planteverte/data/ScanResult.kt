package com.planteverte.data

data class ScanResult(
    val plantName: String?,
    val confidence: Float,
    val suggestions: List<String>,
    val timestamp: Long = System.currentTimeMillis()
)
