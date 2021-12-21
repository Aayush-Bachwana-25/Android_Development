package com.example.multiscreenapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    public static String EXTRA_NAME="com.example.multiscreenapps.extra.Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void performOnClick(View view){
        Toast.makeText(this, "Opening Second Page", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);
        name=findViewById(R.id.editTextTextPersonName);
        String nameText=name.getText().toString();
        intent.putExtra(EXTRA_NAME,nameText);
        startActivity(intent);
    }

}