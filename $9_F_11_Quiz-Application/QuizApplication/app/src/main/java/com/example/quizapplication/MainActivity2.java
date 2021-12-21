package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView question;
    private Button btrue,bfalse;
    private String questions[]={"Is Java named as Oak Earlier?",
            "Does java supports Inheritence?",
            "Does java supports Polymorphism?",
            "Does java supports Multiple Inheritence?",
            "Is Java is an Object Oriented Language?",
            "Is Java named as C++?"};

    private boolean[] answers ={true,true,true,true,true,false};

    static int score=0,index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        question=findViewById(R.id.textView3);
        btrue=findViewById(R.id.btrue);
        bfalse=findViewById(R.id.bfalse);

        question.setText(questions[0]);

        btrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<questions.length){
                    if(answers[index]){
                        score+=5;
                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        score-=1;
                        Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                    }
                    index++;
                    if(index<questions.length){
                        question.setText(questions[index]);
                    }
                }
                else if(index==questions.length){
                    Toast.makeText(getApplicationContext(), "Your score is ::"+score+"/"+questions.length*5, Toast.LENGTH_SHORT).show();
                }
            }
        });

        bfalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<questions.length){
                    if(!answers[index]){
                        score+=5;
                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        score-=1;
                        Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                    }
                    index++;
                    if(index<questions.length){
                        question.setText(questions[index]);
                    }
                }
                else if(index==questions.length){
                    Toast.makeText(getApplicationContext(), "Your score is ::"+score+"/"+questions.length*5, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}