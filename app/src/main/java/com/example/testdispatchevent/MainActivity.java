package com.example.testdispatchevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

    private MyViewGroup mvgV2 = null;
    private MyView mvV2 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Config.show_onTouch) {
            mvgV2 = (MyViewGroup) findViewById(R.id.mvg_v2);
            mvV2 = (MyView) findViewById(R.id.mv_v2);
            mvgV2.setOnTouchListener(new MyTouchListener());
            mvgV2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            mvV2.setOnTouchListener(new MyTouchListener());
            mvV2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (Config.show_main) {
            MyLog.log("MainActivity" + ": " + "dispatchTouchEvent");
        }
        //        return super.dispatchTouchEvent(ev);
        if (Config.detail) {
            switch (ev.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    MyLog.log("MainActivity" + ": " + "dispatchTouchEvent ACTION_DOWN");
                    break;
                case MotionEvent.ACTION_MOVE:
                    MyLog.log("MainActivity" + ": " + "dispatchTouchEvent ACTION_MOVE");
                    break;
                case MotionEvent.ACTION_UP:
                    MyLog.log("MainActivity" + ": " + "dispatchTouchEvent ACTION_UP");
                    break;
            }
        }
        boolean flag = super.dispatchTouchEvent(ev);
        if (Config.show_default) {
            MyLog.log("MainActivity dispatchTouchEvent return" + ": " + flag);
        }

        return flag;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (Config.show_main) {
            MyLog.log("MainActivity" + ": " + "onTouchEvent");
        }
        //        return super.onTouchEvent(event);
        if (Config.detail) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    MyLog.log("MainActivity" + ": " + "onTouchEvent ACTION_DOWN");
                    break;
                case MotionEvent.ACTION_MOVE:
                    MyLog.log("MainActivity" + ": " + "onTouchEvent ACTION_MOVE");
                    break;
                case MotionEvent.ACTION_UP:
                    MyLog.log("MainActivity" + ": " + "onTouchEvent ACTION_UP");
                    break;
            }
        }
        boolean flag = super.onTouchEvent(event);
        if (Config.show_default) {
            MyLog.log("MainActivity onTouchEvent return" + ": " + flag);
        }

        return flag;
    }

    private class MyTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if (v.getId() == R.id.mvg_v2) {
                if (Config.show_main) {
                    MyLog.log(v.getTag().toString() + ": " + "onTouch");
                }
                if (Config.detail) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            MyLog.log(v.getTag().toString() + ": " + "onTouch ACTION_DOWN");
                            break;
                        case MotionEvent.ACTION_MOVE:
                            MyLog.log(v.getTag().toString() + ": " + "onTouchACTION_MOVE");
                            break;
                        case MotionEvent.ACTION_UP:
                            MyLog.log(v.getTag().toString() + ": " + "onTouch ACTION_UP");
                            break;
                    }
                }
                return false;
            } else if (v.getId() == R.id.mv_v2) {
                if (Config.show_main) {
                    MyLog.log(v.getTag().toString() + ": " + "onTouch");
                }
                if (Config.detail) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            MyLog.log(v.getTag().toString() + ": " + "onTouch ACTION_DOWN");
                            break;
                        case MotionEvent.ACTION_MOVE:
                            MyLog.log(v.getTag().toString() + ": " + "onTouch ACTION_MOVE");
                            break;
                        case MotionEvent.ACTION_UP:
                            MyLog.log(v.getTag().toString() + ": " + "onTouch ACTION_UP");
                            break;
                    }
                }
                return false;
            }
            return false;
        }
    }


    
}

















