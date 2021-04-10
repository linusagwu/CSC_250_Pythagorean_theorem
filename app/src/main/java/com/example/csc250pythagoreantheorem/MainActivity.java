 package com.example.csc250pythagoreantheorem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static java.lang.Math.hypot;


 public class MainActivity extends AppCompatActivity
{
    private EditText ValueA;
    private EditText ValueB;
    private TextView ValueC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ValueA = this.findViewById(R.id.A_deci);
        this.ValueB = this.findViewById(R.id.B_deci);
        this.ValueC = this.findViewById(R.id.answerTV);

        this.ValueC.setText("");

    }
    public void onButtonPressed(View v)
    {
        String A = this.ValueA.getText().toString();
        String B = this.ValueB.getText().toString();
        int aVal = Integer.parseInt(A);
        int bVal = Integer.parseInt(B);

        double answer = hypot(aVal, bVal);
        DecimalFormat df = new DecimalFormat("");
        this.ValueC.setText(""+ df.format(answer));

    }
}