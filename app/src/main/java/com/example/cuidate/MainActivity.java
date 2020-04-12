package com.example.cuidate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout autocuidado = (FrameLayout) findViewById(R.id.autocuidado);

        autocuidado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Autocuidado.class);
                startActivity(intent);
            }
        });

        FrameLayout estadisticas = (FrameLayout) findViewById(R.id.estadisticas);

        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Estadisticas.class);
                startActivity(intent);
            }
        });
    }


}
