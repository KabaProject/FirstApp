package com.kabaproject.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHandler();
    }

    protected void buttonHandler() {
        Button button = findViewById(R.id.btnSubmit);

        Map<TextView, EditText> inOut = new HashMap<>();
        inOut.put(findViewById(R.id.txtName), findViewById(R.id.inName));
        inOut.put(findViewById(R.id.txtSurname), findViewById(R.id.inSurname));
        inOut.put(findViewById(R.id.txtEmail), findViewById(R.id.inEmail));

        button.setOnClickListener(view -> {
            for (Map.Entry<TextView, EditText> item : inOut.entrySet()){
                item.getKey().setText(item.getValue().getText().toString());
            }
        });
    }
}