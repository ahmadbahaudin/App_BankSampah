package com.example.loginbanksampah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class setor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setor);
    }
    public void kmbl_home(View view) {
        Intent intent = new Intent(setor.this,homepage.class);
        startActivity(intent);
    }
}