package com.metropolia.helloworld5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText typenum = (EditText) findViewById(R.id.number);
        final TextView result = (TextView) findViewById(R.id.result);

        final double number = 0;

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

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText(typenum.getText() + "0");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typenum.setText("");
            }
        });
    }
}
