package com.geeks.nurkyz_chomoeva_hw3_33;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.nurkyz_chomoeva_hw3_33.databinding.FoodItemBinding;


public class FoodViewHolder extends RecyclerView.ViewHolder {

    FoodItemBinding binding;

    public FoodViewHolder(@NonNull FoodItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String name, String image) {
        binding.tvName.setText(name);

        Glide.with(binding.imgFood).load(image).into(binding.imgFood);
    }
}

