package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMinus,btnMultifly, btnDevision, btnDot, btnEqual, btnC;
    TextView txtResult;
    Float value1;
    Float value2;
    int CheckOperator;
    Boolean flag = true;
    Boolean flag2= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnDevision = (Button) findViewById(R.id.btnDevision);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultifly = (Button) findViewById(R.id.btnMultifly);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnC = (Button) findViewById(R.id.btnC);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;
                    }
                txtResult.setText(txtResult.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;

                    }
                txtResult.setText(txtResult.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckOperator!=0)
                    if(flag)
                    {
                        txtResult.setText("");
                        flag = false;
                        flag2= false;
                    }
                txtResult.setText(txtResult.getText()+".");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1!=null) {
                    if(txtResult.getText()=="")
                        value2=Float.parseFloat("0.0");
                    else
                        value2 = Float.parseFloat(txtResult.getText() + "");
                    CheckOperator();
                    value1 = value2 = null;
                    CheckOperator = '=';
                    flag2=false;
                }
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1==null)
                    if(txtResult.getText()=="")
                        value1=Float.parseFloat("0.0");
                    else
                        value1 =Float.parseFloat(txtResult.getText()+"");
                else if(flag==false)
                    {
                    if(txtResult.getText()=="")
                        value2=Float.parseFloat("0.0");
                    else
                        value2 = Float.parseFloat(txtResult.getText()+"");
                    CheckOperator();
                }
                if(txtResult.getText()!=null)
                {
                    CheckOperator='+';
                    flag2=true;
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1==null)
                    if(txtResult.getText()=="")
                        value1=Float.parseFloat("0.0");
                    else
                        value1 =Float.parseFloat(txtResult.getText()+"");
                else if(flag2==false)
                {
                    if(txtResult.getText()=="")
                        value2=Float.parseFloat("0.0");
                    else
                        value2 = Float.parseFloat(txtResult.getText()+"");
                    CheckOperator();
                }
                if(txtResult.getText()!=null)
                {
                    flag2 = true;
                    CheckOperator='-';
                }
            }
        });
        btnDevision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1==null)
                    if(txtResult.getText()=="")
                        value1=Float.parseFloat("0.0");
                    else
                        value1 =Float.parseFloat(txtResult.getText()+"");
                else if(flag2==false)
                {
                    if(txtResult.getText()=="")
                        value2=Float.parseFloat("0.0");
                    else
                        value2 = Float.parseFloat(txtResult.getText()+"");
                    CheckOperator();
                }
                if(txtResult.getText()!=null)
                {
                    flag2=true;
                    CheckOperator='/';
                }
            }
        });
        btnMultifly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1==null)
                    if(txtResult.getText()=="")
                        value1=Float.parseFloat("0.0");
                    else
                        value1 =Float.parseFloat(txtResult.getText()+"");
                else if(flag2==false)
                {
                    if(txtResult.getText()=="")
                        value2=Float.parseFloat("0.0");
                    else
                        value2 = Float.parseFloat(txtResult.getText()+"");
                    CheckOperator();
                }
                if(txtResult.getText()!=null)
                {
                    flag2=true;
                    CheckOperator='*';
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckOperator=0;
                value1=value2=null;
                txtResult.setText("");
                flag=true;
                flag2=false;
            }
        });
    }

    //check kind of operator
    public void CheckOperator(){
        if(CheckOperator=='+')
            value1 += value2;
        else if(CheckOperator=='-')
            value1 -= value2;
        else if(CheckOperator=='/')
            value1 /= value2;
        else if(CheckOperator=='*')
            value1 *= value2;
        txtResult.setText(value1 + "");
        flag = true;
        flag2=false;
    }
}
