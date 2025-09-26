package com.example.quecookbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnReceta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnReceta = findViewById(R.id.btnPanConQueso);

            findViewById(R.id.btnPanConQueso).setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, RecipeDetailActivity.class);
                intent.putExtra("TITULO", "Pan con Queso");
                intent.putExtra("IMG", R.drawable.pcq);
                intent.putExtra("PORCIONES", 2);
                intent.putExtra("TIEMPO", 5);
                intent.putExtra("DIFICULTAD", "Fácil");
                startActivity(intent);
            });
    }
}
