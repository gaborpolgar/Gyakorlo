package com.gabor.gyakorlo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView textView;
    private EditText editText;
    private Button buttonBigLetterText;
    private Button buttonSmallLetterText;
    private Button buttonRandomColorGenerate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        textView.setText(editText.getText());
        buttonSmallLetterText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString().toLowerCase());
            }
        });
     /*   buttonRandomColorGenerate.setOnClickListener();
        */
        buttonBigLetterText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString().toUpperCase());
            }
        });
                buttonRandomColorGenerate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    Random random = new Random();
                    int red = random.nextInt(256);
                    int green = random.nextInt(256);
                    int blue = random.nextInt(256);
                    textView.setBackgroundColor(Color.rgb(red, green, blue));
                    }
                });

    }

    private void init(){
        relativeLayout = findViewById(R.id.relativeLayout);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        buttonBigLetterText = findViewById(R.id.buttonBigLetterText);
        buttonSmallLetterText = findViewById(R.id.buttonSmallLetterText);
        buttonRandomColorGenerate = findViewById(R.id.buttonRandomColorGenerate);
    }
}