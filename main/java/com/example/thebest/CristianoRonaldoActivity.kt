package com.example.thebest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cristiano_ronaldo.*
import android.view.View

class CristianoRonaldoActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_cristiano_ronaldo)


      btnInfoCristiano.setOnClickListener {
          txvInfoCristiano.setVisibility(View.VISIBLE)

      }

      btnRegresarCristiano.setOnClickListener {
          finish()
      }
  }
}

