package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private TextView win;
    boolean flag = true;
    Intent i;
    public void click(View x)
    {
        if(x.getId()==R.id.btn1 && btn1.getText().toString().isEmpty()){
            if(flag==true) {
                btn1.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn1.setText("0");
                flag = true;
            }
        }
        else if(x.getId()==R.id.btn2 && btn2.getText().toString().isEmpty()){
            if(flag==true) {
                btn2.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn2.setText("0");
                flag = true;
            }
        }
        else if(x.getId()==R.id.btn3 && btn3.getText().toString().isEmpty()){
            if(flag==true) {
                btn3.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn3.setText("0");
                flag = true;
            }
        }
        else if(x.getId()==R.id.btn4 && btn4.getText().toString().isEmpty()){
            if(flag==true) {
                btn4.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn4.setText("0");
                flag = true;
            }
        }
        else if(x.getId()==R.id.btn5 && btn5.getText().toString().isEmpty()){
            if(flag==true) {
                btn5.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn5.setText("0");
                flag = true;
            }
        }
        else if(x.getId()==R.id.btn6 && btn6.getText().toString().isEmpty()){
            if(flag==true) {
                btn6.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn6.setText("0");
                flag = true;
            }
        }
        else if(x.getId()==R.id.btn7 && btn7.getText().toString().isEmpty()){
            if(flag==true) {
                btn7.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn7.setText("0");
                flag = true;
            }
        }
        else if(x.getId()==R.id.btn8 && btn8.getText().toString().isEmpty()){
            if(flag==true) {
                btn8.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn8.setText("0");
                flag = true;
            }
        }
        else if(x.getId()==R.id.btn9 && btn9.getText().toString().isEmpty()){
            if(flag==true) {
                btn9.setText("X");
                flag = false;
            }
            else if(flag == false){
                btn9.setText("0");
                flag = true;
            }
        }
        if((btn1.getText().toString().equals("X")&&btn2.getText().toString().equals("X")&&btn3.getText().toString().equals("X"))
                ||(btn4.getText().toString().equals("X")&&btn5.getText().toString().equals("X")&&btn6.getText().toString().equals("X"))
                ||(btn7.getText().toString().equals("X")&&btn8.getText().toString().equals("X")&&btn9.getText().toString().equals("X"))
                ||(btn1.getText().toString().equals("X")&&btn4.getText().toString().equals("X")&&btn7.getText().toString().equals("X"))
                ||(btn2.getText().toString().equals("X")&&btn5.getText().toString().equals("X")&&btn8.getText().toString().equals("X"))
                ||(btn3.getText().toString().equals("X")&&btn6.getText().toString().equals("X")&&btn9.getText().toString().equals("X"))
                ||(btn1.getText().toString().equals("X")&&btn5.getText().toString().equals("X")&&btn9.getText().toString().equals("X"))
                ||(btn3.getText().toString().equals("X")&&btn5.getText().toString().equals("X")&&btn7.getText().toString().equals("X")) )
        {
            win.setText("Bingo! Player X is winner");
            i = new Intent(this,MainActivity2.class);
            i.putExtra("win1Str","Bingo! Player X is winner");
            finish();
            startActivity(i);
        }
        else if((btn1.getText().toString().equals("0")&&btn2.getText().toString().equals("0")&&btn3.getText().toString().equals("0"))
                ||(btn4.getText().toString().equals("0")&&btn5.getText().toString().equals("0")&&btn6.getText().toString().equals("0"))
                ||(btn7.getText().toString().equals("0")&&btn8.getText().toString().equals("0")&&btn9.getText().toString().equals("0"))
                ||(btn1.getText().toString().equals("0")&&btn4.getText().toString().equals("0")&&btn7.getText().toString().equals("0"))
                ||(btn2.getText().toString().equals("0")&&btn5.getText().toString().equals("0")&&btn8.getText().toString().equals("0"))
                ||(btn3.getText().toString().equals("0")&&btn6.getText().toString().equals("0")&&btn9.getText().toString().equals("0"))
                ||(btn1.getText().toString().equals("0")&&btn5.getText().toString().equals("0")&&btn9.getText().toString().equals("0"))
                ||(btn3.getText().toString().equals("0")&&btn5.getText().toString().equals("0")&&btn7.getText().toString().equals("0")) )
        {
            win.setText("Bingo! Player 0 is winner");
        }
        else if(!btn1.getText().toString().isEmpty()
                &&!btn2.getText().toString().isEmpty()
                &&!btn3.getText().toString().isEmpty()
                &&!btn4.getText().toString().isEmpty()
                &&!btn5.getText().toString().isEmpty()
                &&!btn6.getText().toString().isEmpty()
                &&!btn7.getText().toString().isEmpty()
                &&!btn8.getText().toString().isEmpty()
                &&!btn9.getText().toString().isEmpty())
        {
            win.setText("Draw");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        win = findViewById(R.id.win);
    }
}