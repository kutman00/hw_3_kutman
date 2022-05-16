package com.geektech.hw_3_kutman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.view);
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("9");
        numbers.add("10");
        numbers.add("11");
        numbers.add("12");
        numbers.add("13");
        numbers.add("14");
        numbers.add("15");
        numbers.add("16");
        numbers.add("17");
        numbers.add("18");
        numbers.add("19");
        numbers.add("20");
        NumberAdapter adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);
    }
}
