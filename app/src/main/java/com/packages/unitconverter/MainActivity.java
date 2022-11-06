package com.packages.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText inputKg;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        inputKg=findViewById(R.id.editTextNumber);
        output=findViewById(R.id.output);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String input=inputKg.getText().toString();
                    System.out.println("input = "+input);
                    if(input.isEmpty()){
                        output.setText("Enter valid value!");
                    }else {
                        double inputDouble = Double.parseDouble(input);
                        double pound = inputDouble * 2.25;
                        output.setText(input + " kg are " + pound + " pounds");
                    }
            }
        });
    }

}