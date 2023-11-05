package com.example.my.deliveryapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.my.deliveryapp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getIntentActivity()
    }

    private fun getIntentActivity() {
        val header = intent.getStringExtra("name")
        val timer = intent.getStringExtra("timer")
        val image = intent.getIntExtra("image",0)
        binding.TextViewBurgerCrazeDetailes.text = header
        binding.tvTimerDetailes.text = timer
        binding.imageViewBurgerDetailes.setImageResource(image)
    }

}