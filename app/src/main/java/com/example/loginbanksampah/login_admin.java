package com.example.loginbanksampah;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_admin extends AppCompatActivity {

    EditText Txnama, TxPassword;
    Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        Txnama = (EditText)findViewById(R.id.edit_input_nama);
        TxPassword = (EditText)findViewById(R.id.edit_input_pw);
        BtnLogin = (Button)findViewById(R.id.button);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Txnama.equals("")) {
                    Toast.makeText(login_admin.this, "Nama belum diisi", Toast.LENGTH_SHORT).show();
                } else if (TxPassword.equals("")) {
                    Toast.makeText(login_admin.this, "password belum diisi", Toast.LENGTH_SHORT).show();
                } else {
                    if (Txnama.getText().toString().equals("admin") && TxPassword.getText().toString().equals("admin") ){
                        Intent intent = new Intent (login_admin.this,homepage_admin.class);
                        startActivity(intent);
                        finish();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Pasword salah", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}