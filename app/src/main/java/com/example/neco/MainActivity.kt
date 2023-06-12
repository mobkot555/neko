package com.example.neco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("myLogMA", "-onCreate1")
        Log.d("myLogMA", "-onCreate2")
    }

    override fun onStart() {
        super.onStart()
        Log.d("myLogMA", "-onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("myLogMA", "-onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("myLogMA", "-onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("myLogMA", "-onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myLogMA", "-onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("myLogMA", "-onRestart")
    }


}