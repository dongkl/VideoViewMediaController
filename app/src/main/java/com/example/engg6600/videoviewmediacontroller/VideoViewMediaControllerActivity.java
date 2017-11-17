package com.example.engg6600.videoviewmediacontroller;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewMediaControllerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view_media_controller);

        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        String videoToPlay = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";
        Uri video = Uri.parse(videoToPlay);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(video);
        videoView.start();
    }
}
