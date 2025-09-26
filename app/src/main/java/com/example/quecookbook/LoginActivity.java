package com.example.quecookbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnLogin).setOnClickListener(vInicio -> {
                    Intent intentInicio = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intentInicio
                    );
                    finish();
                });

            TextView tvCreateAccount = findViewById(R.id.tvCrearCuenta);
            tvCreateAccount.setOnClickListener(vRegister -> {
                Intent intentRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intentRegister);
        });
        TextView tvAdmin = findViewById(R.id.tvAdmin);
        tvAdmin.setOnClickListener(vAdmin -> {
            Intent intentAdmin = new Intent(LoginActivity.this, AdminActivity.class);
            startActivity(intentAdmin);
        });
    }
}