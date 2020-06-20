package com.lakue.recyclerviewarcodian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerVierAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getData();

    }

    private void init(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerVierAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getData(){
        DataMovie data = new DataMovie(R.drawable.iron_man, "아이언맨");
        adapter.addItem(data);
        data = new DataMovie(R.drawable.spider_man, "스파이더맨");
        adapter.addItem(data);
        data = new DataMovie(R.drawable.black_panther, "블랙팬서");
        adapter.addItem(data);
        data = new DataMovie(R.drawable.doctor, "닥터스트레인지");
        adapter.addItem(data);
        data = new DataMovie(R.drawable.hulk, "헐크");
        adapter.addItem(data);
        data = new DataMovie(R.drawable.thor, "토르");
        adapter.addItem(data);
    }
}