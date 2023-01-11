package com.example.loginbanksampah;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login2 extends AppCompatActivity {

    EditText Txemail, TxPassword;
    Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Txemail = (EditText)findViewById(R.id.edit_input_email);
        TxPassword = (EditText)findViewById(R.id.edit_input_pw);
        BtnLogin = (Button)findViewById(R.id.button_login);
        TextView tvCreateAccount = (TextView)findViewById(R.id.ke_daftar);

        tvCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login2.this, signup.class));
            }
        });

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Txemail.equals("")) {
                    Toast.makeText(login2.this, "Nama belum diisi", Toast.LENGTH_SHORT).show();
                } else if (TxPassword.equals("")) {
                    Toast.makeText(login2.this, "password belum diisi", Toast.LENGTH_SHORT).show();
                } else {
                    if (Txemail.getText().toString().equals("user1@gmail.com") && TxPassword.getText().toString().equals("user1") ){
                        Intent intent = new Intent (login2.this,homepage.class);
                        startActivity(intent);
                        finish();
                    }
                    else if (Txemail.getText().toString().equals("user2@gmail.com") && TxPassword.getText().toString().equals("user2") ){
                        Intent intent = new Intent (login2.this,homepage.class);
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