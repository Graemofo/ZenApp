package com.nci.graeme.zenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuidedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guided);

        buttonSounds();
        buttonBreathing();
    }

    private void buttonSounds(){
        Button soundsButton = (Button) findViewById(R.id.soundsButton);
        soundsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuidedActivity.this, MainActivity.class));
            }
        });
    }

    private void buttonBreathing(){
        Button breathingButton = (Button) findViewById(R.id.breathingButton);
        breathingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuidedActivity.this, BreathingActivity.class));
            }
        });
    }
}
