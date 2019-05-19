package com.gzeinnumer.antrianpasientv2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gzeinnumer.antrianpasientv2.R;

public class LoginActivity extends AppCompatActivity {
    Button btnperawat,btnpasien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnpasien=(Button)findViewById(R.id.btnpasien);
        btnperawat=(Button)findViewById(R.id.btnperawat);

        btnperawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PerawatActivity.class);
                startActivity(intent);
            }
        });
        btnpasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PasientActivity.class);
                startActivity(intent);
            }
        });
    }
}
