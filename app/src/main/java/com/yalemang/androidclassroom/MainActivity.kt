package com.yalemang.androidclassroom

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.TextView
import android.widget.Toast
import com.yalemang.androidclassroom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
        tv.text = "呵呵"//60fps 16ms Vsync信号
        tv.setOnClickListener{
            Toast.makeText(this,"点击啦",Toast.LENGTH_SHORT).show()
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        if(ev.action == MotionEvent.ACTION_DOWN){
            Log.d("junjie","Down事件")
        }else if(ev.action == MotionEvent.ACTION_MOVE){
            Log.d("junjie","Move事件")
        }else if(ev.action == MotionEvent.ACTION_UP){
            Log.d("junjie","Up事件")
        }else if(ev.action == MotionEvent.ACTION_CANCEL){
            Log.d("junjie","Cancel事件")
        }
        Log.d("junjie","activity-dispatchTouchEvent")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("junjie","activity-onTouchEvent")
        return super.onTouchEvent(event)
    }

}