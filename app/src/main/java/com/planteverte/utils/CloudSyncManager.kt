package com.planteverte.utils

import com.google.firebase.firestore.FirebaseFirestore

class CloudSyncManager(
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
) {

    fun syncPlantData() {
        // TODO: push/pull des données vers Firestore
    }
}
