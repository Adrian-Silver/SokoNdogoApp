package com.example.attempt7

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.attempt7.Helper.HomeAdapter.ProductAdapter
import com.example.attempt7.Helper.HomeAdapter.ProductHelperClass
import java.util.*

class UserDashboard : AppCompatActivity() {
    var rec_veg_fruits: RecyclerView? = null
    var rec_grains_meat: RecyclerView? = null
    var category_text: TextView? = null
    var adapter: RecyclerView.Adapter<*>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_user_dashboard)

//        Hooks
        rec_veg_fruits = findViewById(R.id.rec_veg_fruits)
        rec_grains_meat = findViewById(R.id.rec_grains_meat)
        category_text = findViewById(R.id.category_text)
        rec_veg_fruits()
        rec_grains_meat()

//        category_text();
    }

    fun category_text(view: View?) {
        startActivity(Intent(this, ProductCategories::class.java))
        finish()
    }

    private fun rec_grains_meat() {
        rec_grains_meat!!.setHasFixedSize(true)
        rec_grains_meat!!.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val productLocations = ArrayList<ProductHelperClass>()
        productLocations.add(ProductHelperClass(R.drawable.ic_beef, "Beef", "Kshs.900"))
        productLocations.add(ProductHelperClass(R.drawable.fish_1, "Fish", "Kshs.350"))
        productLocations.add(ProductHelperClass(R.drawable.chicken, "chicken", "Kshs.435"))
        productLocations.add(ProductHelperClass(R.drawable.cut_meat, "Nyama", "Kshs.489"))
        productLocations.add(ProductHelperClass(R.drawable.pork, "Pork", "Kshs.764"))
        productLocations.add(ProductHelperClass(R.drawable.peas, "Peas", "Kshs.155"))
        productLocations.add(ProductHelperClass(R.drawable.maize, "Maize", "Kshs.35"))
        productLocations.add(ProductHelperClass(R.drawable.cereals, "Cereals", "Kshs.135"))
        productLocations.add(ProductHelperClass(R.drawable.chicken, "Kuku", "Kshs.443"))
        adapter = ProductAdapter(productLocations)
        rec_grains_meat!!.adapter = adapter
    }

    private fun rec_veg_fruits() {
        rec_veg_fruits!!.setHasFixedSize(true)
        rec_veg_fruits!!.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val productLocations = ArrayList<ProductHelperClass>()
        productLocations.add(ProductHelperClass(R.drawable.apple, "Apples", "Kshs.150"))
        productLocations.add(ProductHelperClass(R.drawable.bananas, "Bananas", "Kshs.50"))
        productLocations.add(ProductHelperClass(R.drawable.carrot, "Carrots", "Kshs.68"))
        productLocations.add(ProductHelperClass(R.drawable.cabbage, "Cabbage", "Kshs.55"))
        productLocations.add(ProductHelperClass(R.drawable.hoho, "Hoho", "Kshs.25"))
        productLocations.add(ProductHelperClass(R.drawable.avocado, "Avocado", "Kshs.32"))
        productLocations.add(ProductHelperClass(R.drawable.pumpkins, "Pumpkins", "Kshs.228"))
        productLocations.add(ProductHelperClass(R.drawable.potatoes, "Potatoes", "Kshs.135"))
        productLocations.add(ProductHelperClass(R.drawable.icon_veggies, "Veggies", "Kshs.123"))
        adapter = ProductAdapter(productLocations)
        rec_veg_fruits!!.adapter = adapter
    }
}