package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText username,password;
    TextView fotgotPassword,signup;
    Button btnsignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        username=findViewById(R.id.edit_username);
        password=findViewById(R.id.edit_password);
        fotgotPassword=findViewById(R.id.text_forgot);
        signup=findViewById(R.id.text_sinup);
        btnsignin=findViewById(R.id.btn_signin);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this,DrawerActivity.class));

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });
    }
}
