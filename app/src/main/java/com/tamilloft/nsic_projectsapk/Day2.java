package com.tamilloft.nsic_projectsapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Day2 extends AppCompatActivity implements View.OnClickListener {

    TextView t1, t2, t3, t4;
    EditText e1, e2, e3, e4;
    Button b1, b2, b3, b4, b5, b6, b7, b8;
    LinearLayout type1, type2;
    CardView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, btnAdd, btnSub,
            btnMulti, btnDivide, btnPercentage, btnEqual, btnDot, btnAc, btnDe;
    CardView btnVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);
///type 1 page id's
        //Text View
        t1 = findViewById(R.id.ansView);
///type 2 page id's
        //Text View
        t2 = findViewById(R.id.textMain);
        t3 = findViewById(R.id.textLower);
        t4 = findViewById(R.id.textUpper);

        //set up the id's
        type1 = findViewById(R.id.linearBtn1);
        type2 = findViewById(R.id.linearBtn2);

        //Types button
        b1 = findViewById(R.id.btnTyp1);
        b2 = findViewById(R.id.btnTyp2);

        //Math buttons Type 1
        b3 = findViewById(R.id.btnAdd);
        b4 = findViewById(R.id.btnSub);
        b5 = findViewById(R.id.btnMul);
        b6 = findViewById(R.id.btnDiv);
        b7 = findViewById(R.id.btnPer);
        b8 = findViewById(R.id.btnGra);


        //EditText
        e1 = findViewById(R.id.ipView1);
        e2 = findViewById(R.id.ipView2);

////////////////////////////////////////////////////////////////////////////////////////////////////////
// type 2 page id's
        setId(btn1, R.id.btn1);
        setId(btn2, R.id.btn2);
        setId(btn3, R.id.btn3);
        setId(btn4, R.id.btn4);
        setId(btn5, R.id.btn5);
        setId(btn6, R.id.btn6);
        setId(btn7, R.id.btn7);
        setId(btn8, R.id.btn8);
        setId(btn9, R.id.btn9);
        setId(btn0, R.id.btn0);
        setId(btn00, R.id.btn00);
        setId(btnDot, R.id.btnDot);
        setId(btnAc, R.id.btnAc);
        setId(btnDe, R.id.btnDe);
        setId(btnAdd, R.id.btnAddition);
        setId(btnSub, R.id.btnSubtraction);
        setId(btnMulti, R.id.btnMultiply);
        setId(btnDivide, R.id.btnDivide);
        setId(btnEqual, R.id.btnEqual);
        setId(btnPercentage, R.id.btnPercentage);


        //Action Default


        //this method's are types of calculator
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type1.setVisibility(View.VISIBLE);
                type2.setVisibility(View.INVISIBLE);
                b1.setBackgroundResource(R.drawable.backscr_lay_2);
                b2.setBackgroundResource(R.drawable.backscr_lay_1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type1.setVisibility(View.INVISIBLE);
                type2.setVisibility(View.VISIBLE);
                b2.setBackgroundResource(R.drawable.backscr_lay_2);
                b1.setBackgroundResource(R.drawable.backscr_lay_1);

            }
        });

        //this method's are mathematical method's
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(e1.getText().toString());
                Double val2 = Double.parseDouble(e2.getText().toString());
                double val3 = val1 + val2;
                t1.setText(Double.toString(val3));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(e1.getText().toString());
                Double val2 = Double.parseDouble(e2.getText().toString());
                double val3 = val1 - val2;
                t1.setText(Double.toString(val3));
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(e1.getText().toString());
                Double val2 = Double.parseDouble(e2.getText().toString());
                double val3 = val1 * val2;
                t1.setText(Double.toString(val3));
            }
        });
        
        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(e1.getText().toString());
                Double val2 = Double.parseDouble(e2.getText().toString());
                double val3 = val1 / val2;
                t1.setText(Double.toString(val3));
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(e1.getText().toString());
                Double val2 = Double.parseDouble(e2.getText().toString());
                double val3 = val1 % val2;
                t1.setText(Double.toString(val3));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(e1.getText().toString());
                int val2 = Integer.parseInt(e2.getText().toString());
                int val3 = val1 ^ val2;
                t1.setText(Double.toString(val3));
//                if (val1 > val2) {
//                    t1.setText(Double.toString(val1) + " is the grater number\n" +
//                            Double.toString(val2) + " is the les-then number");
//                } else {
//                    t1.setText(Double.toString(val2) + " is the grater number\n" +
//                            Double.toString(val1) + " is the les-then number");
//                }

            }
        });


//////////////////////////////////////////////////////////
        //Action 2 Type2 button


    }

    public String buttonAction(View view) {
        String btnOutput = null;
        switch (view.getId()) {
            case R.id.btn0:
                btnOutput = "0";
                break;
            case R.id.btn1:
                btnOutput = "1";
                break;
            case R.id.btn2:
                btnOutput = "2";
                break;
            case R.id.btn3:
                btnOutput = "3";
                break;
            case R.id.btn4:
                btnOutput = "4";
                break;
            case R.id.btn5:
                btnOutput = "5";
                break;
            case R.id.btn6:
                btnOutput = "6";
                break;
            case R.id.btn7:
                btnOutput = "7";
                break;
            case R.id.btn8:
                btnOutput = "8";
                break;
            case R.id.btn9:
                btnOutput = "9";
                break;
            case R.id.btn00:
                btnOutput = "00";
                break;
            case R.id.btnAc:
                btnOutput = "Ac";
                break;
            case R.id.btnDe:
                btnOutput = "De";
                break;
            case R.id.btnDot:
                btnOutput = ".";
                break;
            case R.id.btnAddition:
                btnOutput = "+";
                break;
            case R.id.btnSubtraction:
                btnOutput = "-";
                break;
            case R.id.btnMultiply:
                btnOutput = "*";
                break;
            case R.id.btnDivide:
                btnOutput = "/";
                break;
            case R.id.btnPercentage:
                btnOutput = "%";
                break;
            case R.id.btnEqual:
                btnOutput = "=";
                break;
            default:
                Toast.makeText(Day2.this, "Error", Toast.LENGTH_SHORT).show();
                System.out.println("error");
        }
       return btnOutput;
    }

    void setId(CardView btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        CardView btnVal = (CardView) v;
        String allText = buttonAction(btnVal);
        String settingTxt = t2.getText().toString();

        if (allText.equals("Ac")){
            t2.setText("0");
            t3.setText("");
            return;
        }
        if (allText.equals("=")){
            t2.setText(t3.getText());
            return;
        }
        if (allText.equals("De")){
            settingTxt = settingTxt.substring(0, settingTxt.length() -1);
        }else {
            settingTxt = settingTxt + allText;

        }

        t2.setText(settingTxt);
    }

    String getResult(String data){
        return "Calculator";
    }
}