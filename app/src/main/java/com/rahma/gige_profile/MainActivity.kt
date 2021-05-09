package com.rahma.gige_profile

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     val videoView:VideoView
     videoView=findViewById(R.id.videoView)
        val mediaController=MediaController(this)
        mediaController.setAnchorView(videoView)

        val onlineUri:Uri= Uri.parse("https://www.instagram.com/reel/CNgJKpunWRA/?igshid=7y3xucnd9owg")
        val offLineUri:Uri= Uri.parse("android.resource://$packageName/${R.raw.img}")
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offLineUri)
        videoView.requestFocus()
        videoView.start()

    }
}