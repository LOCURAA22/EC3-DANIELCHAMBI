package com.daniel.ej2_chambidaniel.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import androidx.core.os.HandlerCompat
import com.daniel.ej2_chambidaniel.R
import com.daniel.ej2_chambidaniel.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySplashBinding
    lateinit var unetebtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        unetebtn=findViewById(R.id.btn_unete)
        unetebtn.setOnClickListener{
            val toast = Toast.makeText(this, "GENIAL, AHORA FORMAS PARTE DE ESTA GRAN COMUNIDAD", Toast.LENGTH_LONG)
            toast.show()
        }

        HandlerCompat.postDelayed(Handler(),{
                                            val intent=Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        },null,3000)
    }
}