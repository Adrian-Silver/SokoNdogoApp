package com.example.attempt7.Helper.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.attempt7.R;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    ArrayList<ProductHelperClass> productLocations;

    public ProductAdapter(ArrayList<ProductHelperClass> productLocations) {
        this.productLocations = productLocations;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        ProductViewHolder productViewHolder = new ProductViewHolder(view);
        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        ProductHelperClass productHelperClass = productLocations.get(position);

        holder.image.setImageResource(productHelperClass.getImage());
        holder.name.setText(productHelperClass.getName());
        holder.price.setText(productHelperClass.getPrice());

    }

    @Override
    public int getItemCount() {
        return productLocations.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name, price;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

//            Hooks
            image = itemView.findViewById(R.id.product_img);
            name = itemView.findViewById(R.id.product_name);
            price = itemView.findViewById(R.id.product_price);


        }
    }



}
