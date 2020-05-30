package com.example.recyclerviewdemo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
        String FoodArray[];
        int images[];
        Context context;
    public MyAdapter(Context ct, String FArray[], int img[]) {
        context = ct;
        FoodArray = FArray;
        images = img;


    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_item, parent, false);
        return new  MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.name_food.setText(FoodArray[position]);
            holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name_food;
        ImageView myImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name_food = itemView.findViewById(R.id.name_food);
            myImage = itemView.findViewById(R.id.myImageView);
        }
    }
}
