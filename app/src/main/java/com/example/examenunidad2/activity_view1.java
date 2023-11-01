package com.example.examenunidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity_view1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view1);

        Button btFindPrincipal = findViewById(R.id.btRegresarViewPr);
        btFindPrincipal.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_Principal.class);
            startActivity(intent);
        });
    }
}