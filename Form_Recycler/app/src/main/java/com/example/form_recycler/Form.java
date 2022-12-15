package com.example.form_recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        Spinner s = findViewById(R.id.paco);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource
                (this, R.array.Generos, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adaptador);


    }
    public void listaProductos (View view){
        Intent intent = new Intent(this, Recycler.class);
        startActivity(intent);
    }
}