package com.webkeyz.lottieanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        heart.setOnClickListener {
            heart.progress = 0f
            heart.pauseAnimation()
            heart.playAnimation()
        }

        send.setOnClickListener {
            send.progress = 0f
            send.pauseAnimation()
            send.playAnimation()
        }

        notification.setOnClickListener {
            notification.progress = 0f
            notification.pauseAnimation()
            notification.playAnimation()
        }
    }
}
