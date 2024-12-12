package com.garciatomaschavez.apmv_fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button openFuego;
    Button openAgua;
    Button openTierra;
    Button openAire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        openFuego = findViewById(R.id.openFuego);
        openAgua = findViewById(R.id.openAgua);
        openAire = findViewById(R.id.openAire);
        openTierra = findViewById(R.id.openTierra);

        openFuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentFuego fragment = new FragmentFuego();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.frameLayout, fragment);
                transaction.commit();
            }
        });

        openAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentAgua fragment = new FragmentAgua();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.frameLayout, fragment);
                transaction.commit();
            }
        });

        openTierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTierra fragment = new FragmentTierra();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, fragment);
                transaction.commit();
            }
        });

        openAire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentAire fragment = new FragmentAire();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.frameLayout, fragment);
                transaction.commit();
            }
        });

    }

}