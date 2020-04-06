package com.slash.slash.android_tutorial_java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textViewMain;
    EditText editTextMain;
    Button buttonMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMain = findViewById(R.id.textView_main); // findViewById 를 통해서 xml 의 id 와 각 View 의 객체를 연결시켜준다
        editTextMain = findViewById(R.id.editText_main);
        buttonMain = findViewById(R.id.button_main);

        buttonMain.setOnClickListener(new View.OnClickListener() { // buttonMain 에 이벤트 리스너를 만들어서 넣어준다
            @Override
            public void onClick(View view) {
                String input = editTextMain.getText().toString(); // editText 로부터 Text 를 가져오는 방법 !
                textViewMain.setText(input); // TextView 에 문자열을 넣는 방법 !
            }
        });
    }
}



