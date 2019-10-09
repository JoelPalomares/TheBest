package com.example.thebest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long=6500


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create animation class object
        val animacion: Animation = AnimationUtils.loadAnimation(this,R.anim.animation)
        txvBest.startAnimation(animacion)

        Handler().postDelayed({
            startActivity(Intent(this, PrincipalActivity::class.java))
            finish()
        },SPLASH_TIME_OUT)

    }
}
