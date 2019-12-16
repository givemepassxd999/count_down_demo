package com.example.countdowndemo

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.countdowndemo.R.string.remain
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        object : CountDownTimer(30000, 1000) {

            override fun onFinish() {
                info.text = getString(R.string.done)
            }

            override fun onTick(millisUntilFinished: Long) {
                info.text = getString(remain).plus("${millisUntilFinished/1000}")
            }

        }.start()
    }
}
