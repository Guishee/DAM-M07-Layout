package com.example.form_recycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {
    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recycler= findViewById(R.id.recyclerId);


        listDatos=new ArrayList<>();

        for(int i=1;i<20;i++){
            listDatos.add("Producto#"+i+" ");
        }

        AdaptadorDatos adapter=new AdaptadorDatos(listDatos);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new GridLayoutManager(this,3));
        recycler.setAdapter(adapter);


        recycler.addOnItemTouchListener(
                new RecyclerItemClicListener(Recycler.this, new RecyclerItemClicListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View v, int position) {

                        Toast.makeText(Recycler.this, "Item en la posición: " + (position+1), Toast.LENGTH_SHORT).show();
                    }
                })
        );
    }
}