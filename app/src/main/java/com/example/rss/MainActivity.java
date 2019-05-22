package com.example.rss;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.content.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView rssURLTV = (TextView) findViewById(R.id.enterRSS);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity.this, RssActivity.class);

                intent.putExtra("rss",rssURLTV.getText().toString());

                startActivity(intent);
            }
        });

    }

}

