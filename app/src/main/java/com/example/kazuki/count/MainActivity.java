package com.example.kazuki.count;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int count;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        count = 0;


    }
    public void add (View v){
        count = count + 1;
        textView.setText("" + count);
        if (count%2==0){
            textView.setTextColor(Color.rgb(255,0,0));
        }
    }

    public void minus (View v){
        count = count - 1;
        textView.setText("" + count);
        if (count%2==0){
            textView.setTextColor(Color.rgb(255,0,0));
        }
    }
    public void clear (View v){
        count = 0;
        textView .setText(String.valueOf(count));
        if (count%2==0){
            textView.setTextColor(Color.rgb(255,0,0));
        }
    }
}
