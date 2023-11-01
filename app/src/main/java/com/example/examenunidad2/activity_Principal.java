package com.example.examenunidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity_Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button btFindView1 = findViewById(R.id.btView1);
        btFindView1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_view1.class);
            startActivity(intent);
        });

        Button btFindView2 = findViewById(R.id.btView2);
        btFindView2.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_view2.class);
            startActivity(intent);
        });

        Button btFindViewlog = findViewById(R.id.btViewLogin);
        btFindViewlog.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}