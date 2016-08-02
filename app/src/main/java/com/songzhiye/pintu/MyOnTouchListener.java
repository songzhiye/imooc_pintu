package com.songzhiye.pintu;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016/8/1.
 */
public class MyOnTouchListener implements View.OnTouchListener {
    private onMyAction myAction;

    public interface onMyAction{
        void onMyActionDown();
        void onMyAcitonUp();
    }

    public void setOnMyAction(onMyAction o){
        myAction = o;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(myAction == null)
            return false;
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                myAction.onMyActionDown();
                return true;
            case MotionEvent.ACTION_UP:
                myAction.onMyAcitonUp();
                return true;
        }

        return false;
    }
}
