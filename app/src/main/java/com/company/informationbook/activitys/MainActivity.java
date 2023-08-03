package com.company.informationbook.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.company.informationbook.adapters.AdapterClass;
import com.company.informationbook.ModelClass;
import com.company.informationbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList=new ArrayList<>();

    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        ModelClass modelClass1=new ModelClass("countries","The Countries");
        ModelClass modelClass2=new ModelClass("leaders","The Leaders");
        ModelClass modelClass3=new ModelClass("museums","The Museums");
        ModelClass modelClass4=new ModelClass("wonders","The Wonders");

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter=new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapter);

    }

}