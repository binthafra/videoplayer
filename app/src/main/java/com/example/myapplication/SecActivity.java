package com.example.myapplication;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class SecActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        videoView = findViewById(R.id.videoView);
        mediaPlayer = MediaPlayer.create(this, R.raw.airtel);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(uri);

        videoView.setMediaController(new MediaController(this));
    }

    public void playAudio(View view) {
        mediaPlayer.start();
    }

    public void stopAudio(View view) {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.airtel);
    }
}
