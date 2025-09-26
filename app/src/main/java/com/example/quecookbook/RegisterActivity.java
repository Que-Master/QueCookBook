package com.example.quecookbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        findViewById(R.id.btnCancel).setOnClickListener(vCancel -> {
            Intent intentCancelar = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intentCancelar);
            finish();
        });


        findViewById(R.id.btnRegister).setOnClickListener(vCrear -> {
            Toast.makeText(this, "Cuenta creada correctamente (bromita)", Toast.LENGTH_SHORT).show();
            Intent intentCrearCuenta = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intentCrearCuenta);
            finish();
        });
    }
}