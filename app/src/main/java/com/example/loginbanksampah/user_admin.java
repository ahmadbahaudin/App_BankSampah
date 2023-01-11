package com.example.loginbanksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user_admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_admin);
    }
    public void user(View view) {
        Intent intent = new Intent(user_admin.this,login2.class);
        startActivity(intent);
    }
    public void admin(View view) {
        Intent intent = new Intent(user_admin.this,login_admin.class);
        startActivity(intent);
    }
}