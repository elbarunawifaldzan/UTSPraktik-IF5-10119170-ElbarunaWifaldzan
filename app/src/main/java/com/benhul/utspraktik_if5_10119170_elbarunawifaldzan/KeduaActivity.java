package com.benhul.utspraktik_if5_10119170_elbarunawifaldzan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KeduaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
    }

    public void pindah2(View view) {
        Intent intent = new Intent(KeduaActivity.this,MainActivity.class);
        startActivity(intent);
    }
}