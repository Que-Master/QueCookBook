package com.example.quecookbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_editar);

        findViewById(R.id.btnCancelar).setOnClickListener(vCancelar -> {
            Intent intentCancelar = new Intent(EditarActivity.this, AdminActivity.class);
            startActivity(intentCancelar);
        });
        findViewById(R.id.btnGuardar).setOnClickListener(vBorrar -> {
            Toast.makeText(this, "Receta editada correctamente (bromitaX3)", Toast.LENGTH_SHORT).show();
            Intent intentGuardar = new Intent(EditarActivity.this, AdminActivity.class);
            startActivity(intentGuardar);
        });
    }
}