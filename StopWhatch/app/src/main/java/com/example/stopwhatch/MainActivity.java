package com.example.stopwhatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
private int seconds = 0;
private boolean isRunnning = false;
private TextView textViewTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTimer = findViewById(R.id.TextViewTimer);
    }

    public void onclickStartTimer(View view) {
        isRunnning = true;
    }

    public void onclickStopTimer(View view) {
        isRunnning = false;
    }

    public void onclickRestartTimer(View view) {
        isRunnning = false;
        seconds = 0;
    }
    private  void runTimer(){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) /60;
        int secs = seconds /  60;
        String.format(Locale.getDefault(), %2d:%2)
    }
}