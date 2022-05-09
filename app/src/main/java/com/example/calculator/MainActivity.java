package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button enter, add, sub, mul, div, clear, CE, BS, dec, buttonSwitch;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView txt1, txt2;
    Double var1, var2;
    Double ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btnOne);
        b2 = findViewById(R.id.btnTwo);
        b3 = findViewById(R.id.btnThree);
        b4 = findViewById(R.id.btnFour);
        b5 = findViewById(R.id.btnFive);
        b6 = findViewById(R.id.btnSix);
        b7 = findViewById(R.id.btnSeven);
        b8 = findViewById(R.id.btnEight);
        b9 = findViewById(R.id.btnNine);
        b0 = findViewById(R.id.btnZero);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);
        CE = findViewById(R.id.btnCE);
        BS = findViewById(R.id.btnBS);
        dec = findViewById(R.id.btnDec);
        enter = findViewById(R.id.btnEqual);
        clear = findViewById(R.id.btnC);
        buttonSwitch = findViewById(R.id.btnToggleSign);

        txt1 = findViewById(R.id.txtNow);
        txt2 = findViewById(R.id.txtOld);

        //to show value of this button in textView1
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("1");
                else txt1.setText(txt1.getText() + "1");
            }
        });
        //to show value of this button in textView1
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("2");
                else txt1.setText(txt1.getText() + "2");
            }
        });
        //to show value of this button in textView1
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("3");
                else txt1.setText(txt1.getText() + "3");
            }
        });
        //to show value of this button in textView1
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("4");
                else txt1.setText(txt1.getText() + "4");
            }
        });
        //to show value of this button in textView1
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("5");
                else txt1.setText(txt1.getText() + "5");
            }
        });
        //to show value of this button in textView1
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("6");
                else txt1.setText(txt1.getText() + "6");
            }
        });
        //to show value of this button in textView1
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("7");
                else txt1.setText(txt1.getText() + "7");
            }
        });
        //to show value of this button in textView1
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("8");
                else txt1.setText(txt1.getText() + "8");
            }
        });
        //to show value of this button in textView1
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (text.equals("0")) txt1.setText("9");
                else txt1.setText(txt1.getText() + "9");
            }
        });
        //to show value of this button in textView1
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) txt1.getText();
                if (!text.equals("0")) txt1.setText(txt1.getText() + "1");
            }
        });

        //to show value of this button in textView1
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + ".");
            }
        });

        //To Add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText(txt1.getText() + "+");
                var1 = Double.parseDouble(txt1.getText() + "");
                txt1.setText("0");
                addition = true;
            }
        });

        //To subtract
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText(txt1.getText() + "-");
                var1 = Double.parseDouble(txt1.getText() + "");
                txt1.setText("0");
                subtract = true;
            }
        });

        //To divide
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText(txt1.getText() + "/");
                var1 = Double.parseDouble(txt1.getText() + "");
                txt1.setText("0");
                divide = true;
            }
        });

        //To multiply
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText(txt1.getText() + "");
                var1 = Double.parseDouble(txt1.getText() + "");
                txt1.setText("0");
                multiply = true;
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText("");
                txt1.setText("0");
            }
        });

        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("0");
            }
        });

        BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = txt1.getText().toString();
                if(str.length()>1){
                    str = str.substring(0, str.length()-1);
                    txt1.setText(str);
                }else txt1.setText("0");
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Double.parseDouble(txt1.getText()+"");
                if(addition == true)
                {
                    txt1.setText(var1 + var2 + "");
                    addition = false;
                }
                if(subtract == true)
                {
                    txt1.setText(var1 - var2 + "");
                    subtract = false;
                }
                if(multiply == true)
                {
                    txt1.setText((var1 * var2) + "");
                    multiply = false;
                }
                if(divide == true)
                {
                    txt1.setText((var1 / var2) + "");
                    divide = false;
                }
                txt2.setText("");
            }
        });

        buttonSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(txt1.getText()+"");
                if(num>0){
                    txt1.setText("-"+num);
                }
                else
                {
                    num = - num;
                    txt1.setText(""+num);
                }
            }
        });
    }
}