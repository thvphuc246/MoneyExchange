package com.metropolia.helloworld5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class RateActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.metropolia.helloworld5.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.metropolia.helloworld5.MESSAGE2";

    private double exRate;
    private String currencyUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.usd_convert:
                if (checked)
                {
                    currencyUnit = new String("USD");
                    System.out.println("USD checked");
                    exRate = 1.09;
                }
                break;
            case R.id.yen_convert:
                if (checked)
                {
                    currencyUnit = new String("Yen");
                    System.out.println("Yen checked");
                    exRate = 124.02;
                }
                break;
        }
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_MESSAGE, exRate);
        intent.putExtra(EXTRA_MESSAGE2, currencyUnit);
        startActivity(intent);
    }
}
