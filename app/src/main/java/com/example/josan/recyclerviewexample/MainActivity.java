package com.example.josan.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.josan.recyclerviewexample.Model.Anime;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List items = new ArrayList();

        items.add(new Anime("Angel Beats","2010-2010","13"));
        items.add(new Anime("Angel Beats","2010-2010","13"));
        items.add(new Anime("Angel Beats","2010-2010","13"));

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new AnimeAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}
