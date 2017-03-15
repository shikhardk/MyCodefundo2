package com.example.shikhar.mycodefundo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView googleMap = (TextView) findViewById(R.id.googleMap);

        googleMap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent map = new Intent(MainActivity.this, Maps.class);
                MainActivity.this.startActivity(map);
            }
        });
    }
}
