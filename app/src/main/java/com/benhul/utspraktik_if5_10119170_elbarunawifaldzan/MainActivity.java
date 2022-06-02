package com.benhul.utspraktik_if5_10119170_elbarunawifaldzan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this,KeduaActivity.class);
        startActivity(intent);
    }
}