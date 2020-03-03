package com.slash.slash.android_tutorial_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    HelloWorld helloWorld = new HelloWorld("이주향", 25, 4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld.name = null;

        ArrayList<HelloWorld> helloWorlds = new ArrayList<>();

        for (HelloWorld hello : helloWorlds) {
            System.out.println(hello.name);
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
}



