package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;



public class SplashActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();






        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
//status=sharedPref.getStatus();


// Toast.makeText(SplashActivity.this, "" + status, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
// overridePendingTransition(R.anim.goup,R.anim.godown);
                finish();

            }
        },2000);


    }


}
