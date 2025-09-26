package com.example.quecookbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.chip.Chip;

public class RecipeDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recipe_detail);

        ImageView imgHeader = findViewById(R.id.imgHeader);
        TextView tvTitulo = findViewById(R.id.tvTitulo);
        Chip chipTiempo = findViewById(R.id.chipTiempo);
        Chip chipPorciones = findViewById(R.id.chipPorciones);
        Chip chipDificultad = findViewById(R.id.chipDificultad);

        // Datos de ejemplo
        String titulo = getIntent().getStringExtra("TITULO");
        int imgRes = getIntent().getIntExtra("IMG", 0);
        int porciones = getIntent().getIntExtra("PORCIONES", 2);
        int tiempo = getIntent().getIntExtra("TIEMPO", 10);
        String dificultad = getIntent().getStringExtra("DIFICULTAD");

        // Rellenar vistas
        if (titulo != null) tvTitulo.setText(titulo);
        if (imgRes != 0) imgHeader.setImageResource(imgRes);

        chipTiempo.setText(tiempo + " min");
        chipPorciones.setText("Porciones: " + porciones);
        chipDificultad.setText(dificultad != null ? dificultad : "Fácil");

        findViewById(R.id.btnVolverReceta).setOnClickListener(vVolverReceta -> {
        Intent intentVolverReceta = new Intent(RecipeDetailActivity.this, MainActivity.class);
        startActivity(intentVolverReceta);
        });
    }
}