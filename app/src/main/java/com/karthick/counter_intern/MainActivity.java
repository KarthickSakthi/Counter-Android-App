package com.karthick.counter_intern;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Count;
    Button Reset;
    TextView Number;
    int value=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Count = findViewById(R.id.Count);
        Reset = findViewById(R.id.Reset);
        Number = findViewById(R.id.Number);
        displayValue(0);
    }
    public  void CounterPlus(View v){
        value++;
        displayValue(value);
    }
    public void resetValue(View v){
        value=0;
        displayValue(0);
   }
   public void displayValue(int value) {
        TextView CountView = (TextView) findViewById(R.id.Number);
        CountView.setText(String.valueOf(value));
    }

}

