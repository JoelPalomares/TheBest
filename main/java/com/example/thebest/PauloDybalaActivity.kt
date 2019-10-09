package com.example.thebest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_paulo_dybala.*

class PauloDybalaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paulo_dybala)

        btnInfoDybala.setOnClickListener {
            txvInfoDybala.setVisibility(View.VISIBLE)

        }

        btnRegresarDybala.setOnClickListener {
            finish()
        }
    }
}
