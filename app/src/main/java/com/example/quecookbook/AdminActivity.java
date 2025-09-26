package com.example.quecookbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin);

        findViewById(R.id.btnCrear).setOnClickListener(vCrear -> {
            Intent intentCrear = new Intent(AdminActivity.this, RecipeCreateActivity.class);
            startActivity(intentCrear);
        });
        findViewById(R.id.btnEditar).setOnClickListener(vEditar -> {
            Intent intent = new Intent(AdminActivity.this, EditarActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btnEliminar).setOnClickListener(vEliminar -> {
            Intent intent = new Intent(AdminActivity.this, BorrarActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btnVolver).setOnClickListener(vVolver -> {
            Intent intentVolver = new Intent(AdminActivity.this, LoginActivity.class);
            startActivity(intentVolver);
        });
    }
}