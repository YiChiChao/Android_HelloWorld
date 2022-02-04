package com.example.hello_world

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast


class MainActivity2 : AppCompatActivity() {
    val TAG = "MainActivity2Log"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_main2)
    }
    override fun onRestart(){
        Log.d(TAG, "onRestart")
        super.onRestart()
    }

    override fun onStart(){
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume(){
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause(){
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop(){
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy(){
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }
}