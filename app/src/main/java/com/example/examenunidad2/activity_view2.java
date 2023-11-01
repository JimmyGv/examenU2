package com.example.examenunidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity_view2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);

        Button btFindPrinl1 = findViewById(R.id.btRegresarView2Pr);
        btFindPrinl1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_Principal.class);
            startActivity(intent);
        });
    }
}