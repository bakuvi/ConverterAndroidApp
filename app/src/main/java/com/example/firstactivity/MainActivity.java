package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertSpeed(View view){
        EditText user_text_field= findViewById(R.id.user_text_field);
        TextView result_textview=findViewById(R.id.result_textview);

        String text=user_text_field.getText().toString();
        if(!text.equals("")){
            float number=0.0f;
            try{
                number=Float.parseFloat(text);
                number*=1.6;
                result_textview.setText(Float.toString(number));
            }
            catch(NumberFormatException e){
                result_textview.setText("введите число!");
            }
        }
    };
}