package com.example.homework_601;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView displayNum;
    private Button btn0, btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnClr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        //нажатие на кнопку "0"
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "0");
            }
        });
        //нажатиен на кнопку "1"
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "1");
            }
        });

        //нажатиен на кнопку "2"
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "2");
            }
        });

        //нажатиен на кнопку "3"
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "3");
            }
        });

        //нажатиен на кнопку "4"
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "4");
            }
        });

        //нажатиен на кнопку "5"
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "5");
            }
        });

        //нажатиен на кнопку "6"
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "6");
            }
        });

        //нажатиен на кнопку "7"
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "7");
            }
        });

        //нажатиен на кнопку "8"
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "8");
            }
        });

        //нажатиен на кнопку "9"
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + "9");
            }
        });

        //нажатиен на кнопку "dot"
        btnDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText(displayNum.getText() + ".");
            }
        });

        //нажатиен на кнопку "clear"
        btnClr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displayNum.setText("0");
            }
        });
    }

    private void initViews(){
        displayNum = findViewById(R.id.displayNum);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDot = findViewById(R.id.btnDot);
        btnClr = findViewById(R.id.btnClr);
    }
}