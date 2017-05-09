package com.metropolia.helloworld5;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private double number = Double.NaN;
    private double resultNum = Double.NaN;
    DecimalFormat decimalFormat = new DecimalFormat("#.#######");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText typenum = (EditText) findViewById(R.id.number);
        final TextView result = (TextView) findViewById(R.id.result);

        final Button button0 = (Button) findViewById(R.id.button0);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button buttonD = (Button) findViewById(R.id.buttonD);
        final Button buttonC = (Button) findViewById(R.id.buttonC);
        final Button convert = (Button) findViewById(R.id.convert_button);

        Intent intent = getIntent();
        final double exRate = intent.getDoubleExtra(RateActivity.EXTRA_MESSAGE, 1);
        final String currencyUnit = intent.getStringExtra(RateActivity.EXTRA_MESSAGE2);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "9");
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + ".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = Double.NaN;
                typenum.setText("");
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("rate: "+ exRate);
                number = Double.parseDouble(typenum.getText().toString());
                System.out.println("num: "+number);
                resultNum = number*exRate;
                System.out.println("res: "+ resultNum);
                result.setText("Result: "+resultNum+" "+currencyUnit);
            }
        });
    }
}
