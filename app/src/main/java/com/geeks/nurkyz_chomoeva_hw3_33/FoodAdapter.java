package com.geeks.nurkyz_chomoeva_hw3_33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.nurkyz_chomoeva_hw3_33.databinding.FoodItemBinding;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private ArrayList<String> foodList;
    private ArrayList<String> imageList;

    public FoodAdapter(ArrayList<String> carList, ArrayList<String> imageList) {
        this.foodList = carList;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoodViewHolder(FoodItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.onBind(foodList.get(position), imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}

