package com.example.administrator.tinkerdemotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


/**
 * 测试Tinker 热修复
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this,"我改版本了。。。。",Toast.LENGTH_LONG).show();
    }
}
