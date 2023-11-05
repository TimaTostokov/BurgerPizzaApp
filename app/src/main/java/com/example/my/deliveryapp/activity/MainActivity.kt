package com.example.my.deliveryapp.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.my.deliveryapp.R
import com.example.my.deliveryapp.adapter.BurgerAdapter
import com.example.my.deliveryapp.adapter.DeliveryAdapter
import com.example.my.deliveryapp.adapter.DetailsAdapter
import com.example.my.deliveryapp.databinding.ActivityMainBinding
import com.example.my.deliveryapp.model.BurgerModel
import com.example.my.deliveryapp.model.DeliveryModel
import com.example.my.deliveryapp.model.DetailsModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var list = arrayListOf<BurgerModel>()
    private var listDelivery = arrayListOf<DeliveryModel>()
    private var listBurgerCraze = arrayListOf<DetailsModel>()
    private lateinit var adapter: DetailsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        loadData()
        LayoutManagerBurger()
        productCategories()
        LayoutManagerDelivery()
        BurgerCraze()
    }

    private fun BurgerCraze() {
        val listBurgerCraze = ArrayList<DetailsModel>()
        listBurgerCraze.add(DetailsModel(R.drawable.img, "Burger Craze", "15-20"))
        listBurgerCraze.add(DetailsModel(R.drawable.vegetarian_pizza, "Vegetarian Pizza", "10-15"))
        listBurgerCraze.add(DetailsModel(R.drawable.img_1, "Burger Craze", "15-20"))
        val adapter = DetailsAdapter(listBurgerCraze, this::onClick)
        binding.rvMenu.adapter = adapter
    }

    private fun onClick(details: DetailsModel) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("Craze", details.header)
        intent.putExtra("timer", details.timer)
        intent.putExtra("image", details.image)
        startActivity(intent)
    }

    private fun loadData() {
        list.add(BurgerModel("Takeaways", R.drawable.burger))
        list.add(BurgerModel("Grocery", R.drawable.grocery))
        list.add(BurgerModel("Convenience", R.drawable.convenience))
        list.add(BurgerModel("Pharmacy", R.drawable.pharmacy))
    }

    private fun LayoutManagerDelivery() {
        val adapter = DeliveryAdapter(listDelivery, this)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.RecycleDelivery.layoutManager = layoutManager
        binding.RecycleDelivery.adapter = adapter
    }

    private fun LayoutManagerBurger() {
        val adapter = BurgerAdapter(list)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvBurger.layoutManager = layoutManager
        binding.rvBurger.adapter = adapter
    }

    private fun productCategories() {
        listDelivery.add(DeliveryModel("Delivery", R.drawable.group))
        listDelivery.add(DeliveryModel("Pichup"))
        listDelivery.add(DeliveryModel("Catering"))
        listDelivery.add(DeliveryModel("Curbside"))
    }

}