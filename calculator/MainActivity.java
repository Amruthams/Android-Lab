package com.example.calculator;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
        EditText edt1;
        EditText edt2;
        Button add,sub,mul,div;
        TextView res;
        float a,b,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=(EditText)findViewById(R.id.ed1);
        edt2=(EditText)findViewById(R.id.ed2);
        add=(Button)findViewById(R.id.button);
        sub=(Button)findViewById(R.id.button2);
        mul=(Button)findViewById(R.id.button3);
        div=(Button)findViewById(R.id.button4);
        res=(TextView)findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(edt1.getText().toString().trim());
                b = Float.parseFloat(edt2.getText().toString().trim());
                result = a + b;
                res.setText(String.valueOf(result));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(edt1.getText().toString().trim());
                b = Float.parseFloat(edt2.getText().toString().trim());
                result = a - b;
                res.setText(String.valueOf(result));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(edt1.getText().toString().trim());
                b = Float.parseFloat(edt2.getText().toString().trim());
                result = a * b;
                res.setText(String.valueOf(result));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(edt1.getText().toString().trim());
                b = Float.parseFloat(edt2.getText().toString().trim());
                result = a / b;
                res.setText(String.valueOf(result));
            }
        });
    }
}