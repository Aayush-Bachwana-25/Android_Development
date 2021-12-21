package com.example.temp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t;
    Button b;
    Button bnew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAction(View view){
        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);
        t=findViewById(R.id.textView3);
        b=findViewById(R.id.button);
        bnew=findViewById(R.id.button2);

        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());

        Integer result=new Integer(n1*n2);
        b.setVisibility(View.INVISIBLE);
        bnew.setVisibility(View.VISIBLE);
        t.setVisibility(View.VISIBLE);
        t.setText(result.toString());
    }

    public void reRun(View view){
        b=findViewById(R.id.button);
        t=findViewById(R.id.textView3);
        bnew=findViewById(R.id.button2);
        t.setVisibility(View.INVISIBLE);
        b.setVisibility(View.VISIBLE);
        bnew.setVisibility(View.INVISIBLE);

        e1.setText(null);
        e2.setText(null);
        t.setText(null);
    }
}