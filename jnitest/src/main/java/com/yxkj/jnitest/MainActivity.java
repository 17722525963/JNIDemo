package com.yxkj.jnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.yxkj.jnidemo.MyJniDemo;

public class MainActivity extends AppCompatActivity {

    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.test);
        textView.setText(MyJniDemo.getString());
        textView.append("\n");
        textView.append(String.valueOf(MyJniDemo.add(2, 5)));
    }
}
