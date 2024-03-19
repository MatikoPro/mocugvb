package com.example.myapplicationtrrtttr.register;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.myapplicationtrrtttr.R;

public class register extends AppCompatActivity {
    private RadioButton englishRadioButton;
    private RadioButton kiswahiliRadioButton;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        // Find radio buttons by their IDs
        englishRadioButton = findViewById(R.id.selected_english_langiage);
        kiswahiliRadioButton = findViewById(R.id.selected_kiswahili_language);

        // Set up listeners for radio buttons
        englishRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // English radio button is checked
                    kiswahiliRadioButton.setChecked(false);
                }
            }
        });

        kiswahiliRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Kiswahili radio button is checked
                    englishRadioButton.setChecked(false);
                }
            }
        });
    }

}
