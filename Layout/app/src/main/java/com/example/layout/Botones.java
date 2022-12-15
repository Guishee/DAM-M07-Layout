package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Botones extends AppCompatActivity {




    CheckBox gatos;
    CheckBox perros;
    CheckBox peces;
    CheckBox todos;
    TextView top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones0);

        gatos=(CheckBox) findViewById(R.id.gatos);
        perros=(CheckBox) findViewById(R.id.Perros);
        peces=(CheckBox) findViewById(R.id.peces);

        top=(TextView) findViewById(R.id.textTop);


    }

    public void checkBox(View view){

            if (gatos.isChecked()) {
                top.setText("gatos");
            }
            if (perros.isChecked()) {
                top.setText("perros");
            }
            if (peces.isChecked()) {
                top.setText("peces");
            }

    }

}