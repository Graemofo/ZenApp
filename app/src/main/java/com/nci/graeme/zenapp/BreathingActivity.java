package com.nci.graeme.zenapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class BreathingActivity extends AppCompatActivity {

    private static final String VIDEO_SAMPLE = "breathing_video";
    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing);

        buttonGuided();
        buttonSounds();

        mVideoView = findViewById(R.id.videoview);

        mVideoView.start();


    }

    private void buttonGuided(){
        Button guidedButton = (Button) findViewById(R.id.guidedButton);
        guidedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BreathingActivity.this, GuidedActivity.class));
            }
        });
    }

    private void buttonSounds(){
        Button soundsButton = (Button) findViewById(R.id.soundsButton);
        soundsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BreathingActivity.this, MainActivity.class));
            }
        });
    }

    private Uri getMedia(String mediaName) {
        return Uri.parse("android.resource://" + getPackageName() +
                "/raw/" + mediaName);
    }

    private void initializePlayer() {
        Uri videoUri = getMedia(VIDEO_SAMPLE);
        mVideoView.setVideoURI(videoUri);
    }

    private void releasePlayer() {
        mVideoView.stopPlayback();
    }

    @Override
    protected void onStart() {
        super.onStart();

        initializePlayer();
    }

    @Override
    protected void onStop() {
        super.onStop();

        releasePlayer();
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            mVideoView.pause();
        }
    }




}
