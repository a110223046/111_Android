package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnIncrease_Click(View view){
        int count;
        TextView output = (TextView)  findViewById(R.id.txtNumber);
        count=Integer.parseInt(output.getText().toString());
        count++;
        output.setText(Integer.toString(count));

    }
    public void btnZero_click(View view){
        TextView output = (TextView)  findViewById(R.id.txtNumber);
        output.setText("0");

    }
}