package com.yxkj.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "JNIDemo";

    private TextView textView;

    static {
        System.loadLibrary("MyDemo");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.test);
        textView.setText(MyJniDemo.getString());

        textView.append("\n");
        textView.append(String.valueOf(MyJniDemo.add(5, 99)));

    }


}
