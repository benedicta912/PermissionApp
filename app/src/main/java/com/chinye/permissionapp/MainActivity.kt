package com.chinye.permissionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  var nameOfUser = "Papa John"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.galleryButton.setOnClickListener {
            nameOfUser = binding.nameInput.text.toString()
            setName(nameOfUser)
        }
    }


    private fun openGallery(){
        val intent = Intent(Intent.ACTION_PICK)
        startActivity(intent)
    }

    private fun setName(name: String){
        binding.tv.text = name
    }
}