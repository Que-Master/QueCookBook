package com.example.quecookbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BorrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_borrar);
        findViewById(R.id.btnCancelar).setOnClickListener(vCancelar -> {
            Intent intentCancelar = new Intent(BorrarActivity.this, AdminActivity.class);
            startActivity(intentCancelar);
        });
        findViewById(R.id.btnBorrar).setOnClickListener(vBorrar -> {
            Toast.makeText(this, "Receta eliminada correctamente (bromitaX4)", Toast.LENGTH_SHORT).show();
            Intent intentBorrar = new Intent(BorrarActivity.this, AdminActivity.class);
            startActivity(intentBorrar);
        });
    }
}