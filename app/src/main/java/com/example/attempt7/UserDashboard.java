package com.example.attempt7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.attempt7.Helper.HomeAdapter.ProductAdapter;
import com.example.attempt7.Helper.HomeAdapter.ProductHelperClass;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView rec_veg_fruits;
    RecyclerView rec_grains_meat;
    TextView category_text;

    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_user_dashboard);

//        Hooks
        rec_veg_fruits = findViewById(R.id.rec_veg_fruits);
        rec_grains_meat = findViewById(R.id.rec_grains_meat);
        category_text = findViewById(R.id.category_text);

        rec_veg_fruits();

        rec_grains_meat();

//        category_text();

    }

    public void category_text(View view) {
        startActivity(new Intent(this, ProductCategories.class));
        finish();
    }

    private void rec_grains_meat() {
        rec_grains_meat.setHasFixedSize(true);
        rec_grains_meat.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<ProductHelperClass> productLocations = new ArrayList<>();

        productLocations.add(new ProductHelperClass(R.drawable.ic_beef,"Beef","Kshs.900"));
        productLocations.add(new ProductHelperClass(R.drawable.fish_1,"Fish","Kshs.350"));
        productLocations.add(new ProductHelperClass(R.drawable.chicken,"chicken","Kshs.435"));
        productLocations.add(new ProductHelperClass(R.drawable.cut_meat,"Nyama","Kshs.489"));
        productLocations.add(new ProductHelperClass(R.drawable.pork,"Pork","Kshs.764"));
        productLocations.add(new ProductHelperClass(R.drawable.peas,"Peas","Kshs.155"));
        productLocations.add(new ProductHelperClass(R.drawable.maize,"Maize","Kshs.35"));
        productLocations.add(new ProductHelperClass(R.drawable.cereals,"Cereals","Kshs.135"));
        productLocations.add(new ProductHelperClass(R.drawable.chicken,"Kuku","Kshs.443"));

        adapter = new ProductAdapter(productLocations);
        rec_grains_meat.setAdapter(adapter);




    }

    private void rec_veg_fruits() {
        rec_veg_fruits.setHasFixedSize(true);
        rec_veg_fruits.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<ProductHelperClass> productLocations = new ArrayList<>();

        productLocations.add(new ProductHelperClass(R.drawable.apple,"Apples","Kshs.150"));
        productLocations.add(new ProductHelperClass(R.drawable.bananas,"Bananas","Kshs.50"));
        productLocations.add(new ProductHelperClass(R.drawable.carrot,"Carrots","Kshs.68"));
        productLocations.add(new ProductHelperClass(R.drawable.cabbage,"Cabbage","Kshs.55"));
        productLocations.add(new ProductHelperClass(R.drawable.hoho,"Hoho","Kshs.25"));
        productLocations.add(new ProductHelperClass(R.drawable.avocado,"Avocado","Kshs.32"));
        productLocations.add(new ProductHelperClass(R.drawable.pumpkins,"Pumpkins","Kshs.228"));
        productLocations.add(new ProductHelperClass(R.drawable.potatoes,"Potatoes","Kshs.135"));
        productLocations.add(new ProductHelperClass(R.drawable.icon_veggies,"Veggies","Kshs.123"));

        adapter = new ProductAdapter(productLocations);
        rec_veg_fruits.setAdapter(adapter);

    }





}
