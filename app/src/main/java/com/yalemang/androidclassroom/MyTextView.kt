package com.yalemang.androidclassroom


import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.widget.AppCompatTextView

class MyTextView: AppCompatTextView {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        Log.d("junjie","MyTextView-dispatchTouchEvent")
        if(ev.action == MotionEvent.ACTION_CANCEL){
            Log.d("junjie*","Cancel事件")
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if(event.action == MotionEvent.ACTION_CANCEL){
            Log.d("junjie*","Cancel事件")
        }
        Log.d("junjie","MyTextView-onTouchEvent")
        return super.onTouchEvent(event)

    }


}