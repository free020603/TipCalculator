package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTip(View V)
    {
        // Get reference to all elements on app screen
        EditText billEditText = findViewById(R.id.billEditText);
        EditText tipEditText = findViewById(R.id.tipEditText);
        EditText totalBillEditText = findViewById(R.id.totalBillEditText);

        try
        {
            double userBill = Integer.parseInt(billEditText.getText().toString());
            double calcTip = Integer.parseInt(tipEditText.getText().toString());

            DecimalFormat df = new DecimalFormat("####.##");

            double tip =  calcTip * 0.01;
            tip = tip * userBill;
            double total = userBill + tip;

            tipEditText.setText("$" + df.format(tip));
            totalBillEditText.setText("$" + df.format(total));
        }
        catch(Exception n)
        {
            Toast.makeText(getApplicationContext(),"Please fill in all blanks properly",Toast.LENGTH_SHORT).show();
        }
    }

    public void great(View v)
    {

        EditText billEditText = findViewById(R.id.billEditText);
        EditText tipEditText = findViewById(R.id.tipEditText);
        TextView totalBillEditText = (TextView)findViewById(R.id.totalBillEditText);
        double userBill;

        try
        {
            userBill = Integer.parseInt(billEditText.getText().toString());

            double tip = 20 * 0.01;

            tip = tip * userBill;

            double total = userBill + tip;


            tipEditText.setText("20");
        }
        catch(Exception n)
        {
            Toast.makeText(getApplicationContext(),"Please fill in the bill cost",Toast.LENGTH_SHORT).show();
        }
    }

    public void good(View v)
    {

        EditText billEditText = findViewById(R.id.billEditText);
        EditText tipEditText = findViewById(R.id.tipEditText);
        TextView totalBillEditText = findViewById(R.id.totalBillEditText);
        double userBill;

        try
        {
            userBill = Integer.parseInt(billEditText.getText().toString());

            double tip = 15 * 0.01;

            tip = tip * userBill;

            double total = userBill + tip;


            tipEditText.setText("15");
        }
        catch(Exception n)
        {
            Toast.makeText(getApplicationContext(),"Please fill in the bill cost",Toast.LENGTH_SHORT).show();
        }
    }

    public void bad(View v)
    {

        EditText billEditText = findViewById(R.id.billEditText);
        EditText tipEditText = findViewById(R.id.tipEditText);
        TextView totalBillEditText = findViewById(R.id.totalBillEditText);
        double userBill;

        try
        {
            userBill = Integer.parseInt(billEditText.getText().toString());

            double tip = 10 * 0.01;

            tip = tip * userBill;

            double total = userBill + tip;


            tipEditText.setText("10");
        }
        catch(Exception n)
        {
            Toast.makeText(getApplicationContext(),"Please fill in the bill cost",Toast.LENGTH_SHORT).show();
        }
    }
}
