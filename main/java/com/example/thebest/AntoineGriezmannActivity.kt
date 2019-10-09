package com.example.thebest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_antoine_griezmann.*

class AntoineGriezmannActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_antoine_griezmann)

        btnInfoGriezmann.setOnClickListener {
            txvInfoGriezmann.setVisibility(View.VISIBLE)

        }

        btnRegresarGriezmann.setOnClickListener {
            finish()
        }
    }
}
