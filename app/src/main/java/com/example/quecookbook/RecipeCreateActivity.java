package com.example.quecookbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RecipeCreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_recipe_create);
        findViewById(R.id.btnCancelar).setOnClickListener(vCancelar -> {
            Intent intentCancelar = new Intent(RecipeCreateActivity.this, AdminActivity.class);
            startActivity(intentCancelar);
        });
        findViewById(R.id.btnGuardar).setOnClickListener(vBorrar -> {
            Toast.makeText(this, "Receta creada correctamente (bromitaX2)", Toast.LENGTH_SHORT).show();
            Intent intentGuardar = new Intent(RecipeCreateActivity.this, AdminActivity.class);
            startActivity(intentGuardar);
        });
    }
}