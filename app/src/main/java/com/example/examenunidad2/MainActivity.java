package com.example.examenunidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btFindPrin = findViewById(R.id.btLogin);
        btFindPrin.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_Principal.class);
            startActivity(intent);
        });
    }
}