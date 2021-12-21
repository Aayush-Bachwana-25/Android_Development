package com.example.practiceset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private TextView MyView;

    private EditText a1;
    private EditText a2;
    private TextView res;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Task-1

//        //Wishing Good Morning using Toast
//        Toast.makeText(MainActivity.this, "Good Morning Aayush!!", Toast.LENGTH_SHORT).show();
//
//        //Wishing Good Morning using findViewMyID
//        MyView=findViewById(R.id.MyView);
//        MyView.setText("Hello there! I wish you a very very Good Morning...");

        //Task-2
        //Create an app that 2 numbers.

//        a1=findViewById(R.id.number1);
//        a2=findViewById(R.id.number2);
//        res=findViewById(R.id.result);
//        button=findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int a=Integer.parseInt(a1.getText().toString());
//                int b=Integer.parseInt(a2.getText().toString());
//
////                String s1=a1.getText().toString();
////                String s2=a2.getText().toString();
////
////                int a=Integer.parseInt(s1);
////                int b=Integer.parseInt(s2);
//                int p=a+b;
//
//                res.setText("Addition is::"+p);
//            }
//        }
//        );




    }
}