package com.example.thebest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        //Switch
        when (item.itemId){
            R.id.itmCristiano-> {
                startActivity(Intent(this, CristianoRonaldoActivity::class.java))
            }
            R.id.itmGriezmann-> {
                startActivity(Intent(this, AntoineGriezmannActivity::class.java))
            }
            R.id.itmDybala-> {
                startActivity(Intent(this, PauloDybalaActivity::class.java))
            }
            R.id.itmSalir-> {
                System.exit(0)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
