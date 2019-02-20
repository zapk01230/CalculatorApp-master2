package sdu.cs.eakkapod.calculatorapp;

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

        final EditText number1EditText = findViewById(R.id.editNumber1);
        final EditText number2EditText = findViewById(R.id.editNumber2);
        Button   addButton        = findViewById(R.id.btADD);
        Button   addButton2       = findViewById(R.id.btADD2);
        Button   addButton3       = findViewById(R.id.btADD3);
        Button   addButton4       = findViewById(R.id.btADD4);
        final TextView resultTextView  = findViewById(R.id.tvReslut);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1  = Integer.parseInt(number1EditText.getText().toString());
                int num2  = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
        addButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1  = Integer.parseInt(number1EditText.getText().toString());
                int num2  = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 - num2;
                resultTextView.setText(result + "");
            }
        });
        addButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1  = Integer.parseInt(number1EditText.getText().toString());
                int num2  = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });
        addButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1  = Integer.parseInt(number1EditText.getText().toString());
                int num2  = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });

    }//end onCreate
}//end class
