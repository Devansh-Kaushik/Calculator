package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b5,b6,b7,b9,b10,b11,b0;
    Button add,sub,mul,div,eql,modl;
    TextView a;
    int first,second,ans;
    boolean divb;
    boolean addb;
    boolean subb;
    boolean mulb;
    boolean modlb;
    Button Cle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        a=(TextView) findViewById(R.id.textView) ;
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        div=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        mul=(Button) findViewById(R.id.button8);
        eql=(Button) findViewById(R.id.button9);
        b0=(Button) findViewById(R.id.button10);
        add=(Button) findViewById(R.id.button11);
        sub=(Button) findViewById(R.id.button12);
        b9=(Button) findViewById(R.id.button13) ;
        b10=(Button) findViewById(R.id.button14) ;
        b11=(Button) findViewById(R.id.button15) ;
        modl=(Button) findViewById(R.id.button16) ;
        Cle=(Button) findViewById(R.id.button17);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { a.setText(a.getText()+"0");}
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) { a.setText(a.getText()+"1"); }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                a.setText(a.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                a.setText(a.getText()+"3");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                a.setText(a.getText()+"4");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                a.setText(a.getText()+"5");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                a.setText(a.getText()+"6");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                a.setText(a.getText() + "7");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                a.setText(a.getText()+"8");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                a.setText(a.getText() + "9");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a ==null)
                {
                    a.setText(" ");
                }
                else {

                    first = Integer.parseInt(a.getText() + "");
                    divb = true;
                    a.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a ==null)
                {
                    a.setText("");
                }
                else {
                    first=Integer.parseInt(a.getText() + "");
                    mulb = true;
                    a.setText(null);

                }
            }
        });
        modl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==null)
                {
                    a.setText("");
                }
                else {
                    first=Integer.parseInt(a.getText() + "");
                    modlb = true;
                    a.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==null)
                {
                    a.setText("");
                }
                else {
                    first=Integer.parseInt(a.getText() + "");
                    subb = true;
                    a.setText(null);
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==null)
                {
                    a.setText("");
                }
                else {
                    first=Integer.parseInt(a.getText() + "");
                    addb = true;
                    a.setText(null);
                }
            }
        });
        Cle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText(null);
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override

            public void onClick(View v) {
                if(divb== true)
                {
                    second=Integer.parseInt(a.getText()+ "");
                    ans=first/second;
                    a.setText(ans + " ");
                    divb=false;
                }
                if(mulb== true) {
                    second = Integer.parseInt(a.getText() + "");
                    a.setText(" ");
                    ans = first * second;
                    a.setText(ans + " ");
                    mulb=false;

                }
                if(modlb== true)
                {
                    second=Integer.parseInt(a.getText()+ "");
                    ans=first%second;
                    a.setText(ans + " ");
                    modlb=false;
                }
                if(subb== true)
                {
                    second=Integer.parseInt(a.getText()+ "");
                    ans=first-second;
                    a.setText(ans + " ");
                    subb=false;
                }
                if(addb== true)
                {
                    second=Integer.parseInt(a.getText()+ "");
                    ans=first+second;
                    a.setText(ans + " ");
                    addb=false;
                }
            }
        });






    }
}