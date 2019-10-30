package com.example.kotlintoasts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sarveshathawale.kotlintoasts.longToast
import com.sarveshathawale.kotlintoasts.shortToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShortToast.setOnClickListener {
            shortToast { "This is an example of toast with Short duration" }
        }

        btnLongToast.setOnClickListener {
            longToast { "This is an example of toast with Long duration" }
        }
    }
}
