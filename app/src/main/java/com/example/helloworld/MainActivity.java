package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.text);

        //User can tap on a button to change the text color of the label.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text color of the label
                textView.setTextColor(getResources().getColor(R.color.white));

            }
        });

        //User can tap on a button to change the background color.
        findViewById(R.id.ChangeBackgroundbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the background color(#775566)
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.darkPink));
            }
        });

        //User can tap on a button to change the text
        findViewById(R.id.ChangeTextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text label --'Android is awesome!"
                textView.setText("Android is awesome!");
            }
        });

        //User can tap on background to reset all the views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. Reset the text to "Hello from Phumz!"
                textView.setText("Hello from Phumz!");

                //2. Reset the color of the text to the original color
                textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

                //3. Reset the background color to the original color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.pale_lavender));
            }
        });

        //User can tap on "change to custom text" to update the text label from the text field
        findViewById(R.id.ChangecustomTextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text view to what's in the edit text field
                String userText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //If the text field is empty, update label to default text string
                if (userText.isEmpty()) {
                    textView.setText("Please enter your text");
                } else {
                    textView.setText(userText);
                }
            }
        });
    }
}