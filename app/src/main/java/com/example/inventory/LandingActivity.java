package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;

public class LandingActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Handler handler;
    private Runnable runnable;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

            ProgressBar progressBar = findViewById(R.id.progressBar); // Find the ProgressBar by its ID

// Set the maximum progress value (optional)
            progressBar.setMax(200);

// Set the initial progress value (optional)
            progressBar.setProgress(0);

// Start a background task to update the progress value
            ProgressBar finalProgressBar = progressBar;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int progress = 0; progress <= 300; progress++) {
// Update the progress value on the UI thread
                        final int finalProgress = progress;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                finalProgressBar.setProgress(finalProgress);
                            }
                        });

                        // Simulate a delay to show the progress bar animation
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(100);

        ObjectAnimator animation = ObjectAnimator.ofInt(progressBar, "progress", 0, 100);
        animation.setDuration(3000); // Set the progress bar to run for 4 seconds
        animation.setInterpolator(new LinearInterpolator());
        animation.start();

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LandingActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable, 3000); // Switch to the Login Activity after 3 seconds
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }
    }

