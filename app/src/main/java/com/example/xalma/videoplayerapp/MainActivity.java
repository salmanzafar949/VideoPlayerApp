package com.example.xalma.videoplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView myvideoview = (VideoView) findViewById(R.id.video);
        myvideoview.setVideoPath("https://www.youtube.com/watch?v=UGkLd1pxHQ0");

        // Media Controlls

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(myvideoview);
        myvideoview.setMediaController(mediaController);


        myvideoview.start();


    }
}
