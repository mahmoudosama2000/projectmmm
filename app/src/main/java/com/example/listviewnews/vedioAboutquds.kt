package com.example.listviewnews

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory

class vedioAboutquds : AppCompatActivity() {

    var videoURL ="https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4"
    var playerView: PlayerView? = null
    var player: SimpleExoPlayer? = null

    private var playwhenReady = true
    private var currentWindow = 0
    private var playBackPosition: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vedio_aboutquds)
        playerView = findViewById(R.id.videoViwe)

    }

    fun initVideo() {
        player = ExoPlayerFactory.newSimpleInstance(this)
        playerView!!.setPlayer(player)
        val uri = Uri.parse(videoURL)
        val dataSourceFactory: DataSource.Factory =
            DefaultDataSourceFactory(this, "exoplayer-codelab")
        val mediaSource: MediaSource =
            ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(uri)
        player?.setPlayWhenReady(playwhenReady)
        player?.seekTo(currentWindow, playBackPosition)
        player?.prepare(mediaSource, false, false)
    }

    fun releaseVideo() {
        if (player != null) {
            playwhenReady = player!!.playWhenReady
            playBackPosition = player!!.currentPosition
            currentWindow = player!!.currentWindowIndex
            player!!.release()
            player = null
        }
    }

    override fun onStart() {
        super.onStart()
        initVideo()
    }

    override fun onResume() {
        super.onResume()
        if (player != null) {
            initVideo()
        }
    }

    override fun onPause() {
        super.onPause()
        releaseVideo()
    }

    override fun onStop() {
        super.onStop()
        releaseVideo()
    }

}