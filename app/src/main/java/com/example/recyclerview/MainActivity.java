package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    List<Parents> myData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        myData=new ArrayList<>();
        myData.add(new Parents("Item1","Title1"));
        myData.add(new Parents("Item2","Title2"));
        myData.add(new Parents("Item3","Title3"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        myData.add(new Parents("Item4","Title4"));
        adapter=new CustomAdapter(this,myData);
        recyclerView.setAdapter(adapter);
    }
}
