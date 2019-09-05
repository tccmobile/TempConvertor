package com.example.tempconvertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText tempText;
    Button convertButton;
    TextView resultText;
    RadioButton CtFButton;
    RadioButton FtCButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempText = (EditText)findViewById(R.id.tempText);
        convertButton = (Button)findViewById(R.id.convertButton);
        resultText = (TextView)findViewById(R.id.resultView);
        CtFButton = (RadioButton)findViewById(R.id.CtFButton);
        FtCButton = (RadioButton)findViewById(R.id.FtCButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(tempText.getText().toString());
                double result;

                if (FtCButton.isChecked()){
                    result = (temp-32)*(5.0/9.0);
                } else {
                    result = (temp *(9.0/5.0)+32);
                }

                resultText.setText("Result: "+result);
            }
        });

    }
}
