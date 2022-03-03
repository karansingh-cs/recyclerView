package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.SearchView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter myAdapter;
    String[] foodNames = {"Oatmeal", "Almonds","Banana","Sweet Potatoes","Broccoli","Steak","Protein Smoothie","Tuna Sandwich","Yogurt","Scrambled Eggs"};
    String[] rich = {"Oatmeal has a well-balanced nutritional profile, providing these nutrients: Calories: 95. Protein: 5 grams. Fat: 3 grams.",
            "vitamin E, magnesium, and riboflavin, and a good source of fiber and phosphorus",
            "potassium and fiber", "beta carotene, vitamin C, and potassium","a wealth of nutrients and antioxidants","rich in high-quality protein, vitamins, and minerals",
            "Rich in protein and calories", "omega-3 fatty acids", "protein, calcium and potassium", "protein, B vitamins, calcium, vitamin A, phosphorus and iron"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new RecyclerAdapter(this,foodNames);
        recyclerView.setAdapter(myAdapter);
    }
}