package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.Toast;

public class MobilesActivity extends AppCompatActivity
{
    SwipeRefreshLayout pullToRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobiles);
        pullToRefresh = (SwipeRefreshLayout) findViewById(R.id.pullToRefresh);

        pullToRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener()
        {
            int Refreshcounter = 1;
            @Override
            public void onRefresh() {
                //Toast.makeText(MobilesActivity.this, "Page Refreshed...", Toast.LENGTH_SHORT).show();

                if (Refreshcounter == Refreshcounter)
                {
                    Toast.makeText(MobilesActivity.this, "Page Refreshed...", Toast.LENGTH_SHORT).show();
                    pullToRefresh.setRefreshing(false);

                }

                Refreshcounter = Refreshcounter + 1;
                pullToRefresh.setRefreshing(false);
            }
        });

    }
}
