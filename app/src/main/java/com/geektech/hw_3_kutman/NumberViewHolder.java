package com.geektech.hw_3_kutman;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;


    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.number);
    }

    public void bind(String numbers) {
        textView.setText(numbers);
    }
}
