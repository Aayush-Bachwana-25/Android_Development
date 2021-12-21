package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textViewRes;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);
        textViewRes = findViewById(R.id.textView2);

        //Using Event-Listner
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Pop-Up
//                //Toast.makeText(MainActivity.this, "Hello! Click Listener Worked.", Toast.LENGTH_SHORT).show();
//
//                String s=editText.getText().toString();
//                int kg=Integer.parseInt(s);
//                double pound=kg*2.205;
//                textViewRes.setText("The corresponding value of kg in pound is "+pound);
//            }
//        });

    }

    //Using onclick()
    public void Calculate(View view){
        String s=editText.getText().toString();
        int kg=Integer.parseInt(s);
        double pound=kg*2.205;
        textViewRes.setText("The corresponding value of kg in pound is "+pound);
    }

}