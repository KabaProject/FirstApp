package com.kabaproject.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text;
    private EditText inText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.text = findViewById(R.id.txtMessage);
        this.button = findViewById(R.id.btnToggle);
        this.inText = findViewById(R.id.inText);

        buttonHandler();
    }

    protected void buttonHandler() {
        this.button.setOnClickListener(view -> {
            this.text.setText(this.inText.getText().toString());
        });
    }
}