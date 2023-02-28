package com.yalemang.androidclassroom

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.RelativeLayout

class MyRelativeLayout(context:Context): RelativeLayout(context) {

    constructor(context: Context, attrs: AttributeSet):this(context)


    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.d("junjie","RelativeLayout-dispatchTouchEvent")
        return super.dispatchTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        Log.d("junjie","RelativeLayout-onInterceptTouchEvent")
        if(ev.action == MotionEvent.ACTION_MOVE || ev.action == MotionEvent.ACTION_UP){



            return true
        }
        return super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("junjie","RelativeLayout-onTouchEvent")
        return super.onTouchEvent(event)
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }
}