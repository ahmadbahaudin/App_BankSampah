package com.example.loginbanksampah;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    EditText TxUsername,TxEmail,Txtlp, TxPassword, TxConPassword;
    Button BtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TxUsername = (EditText)findViewById(R.id.edit_input_nama);
        TxEmail = (EditText)findViewById(R.id.edit_input_email);
        Txtlp = (EditText)findViewById(R.id.edit_input_tlp);
        TxPassword = (EditText)findViewById(R.id.edit_input_pw);
        TxConPassword = (EditText)findViewById(R.id.edit_input_conpasword);
        BtnRegister = (Button)findViewById(R.id.button_signup);

        TextView tvRegister = (TextView)findViewById(R.id.masukSekarang);

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signup.this, login2.class));
            }
        });

        BtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}