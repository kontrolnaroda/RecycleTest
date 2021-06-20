package com.example.stopwhatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
private int seconds = 0;
private boolean isRunning = false;
private TextView textViewTimer;
private  boolean wasRunning = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTimer = findViewById(R.id.TextViewTimer);
        runTimer();
    }

    public void onclickStartTimer(View view) {
        isRunning = true;
wasRunning = true;
    }

    public void onclickStopTimer(View view) {
        if (wasRunning) {
            isRunning = false;
            wasRunning = false;
        } else { isRunning = true; wasRunning = true;}
    }

    public void onclickRestartTimer(View view) {
        isRunning = false;wasRunning = false;
        seconds = 0;
    }
    private  void runTimer(){
      final  Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) /60;
                int secs = seconds %  60;
                String time = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, secs);
                textViewTimer.setText(time);
                if (isRunning) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });

    }
}