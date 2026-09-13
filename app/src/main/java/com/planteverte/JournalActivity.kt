package com.planteverte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.planteverte.databinding.ActivityJournalBinding

class JournalActivity : AppCompatActivity() {

    private lateinit var b: ActivityJournalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityJournalBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}
