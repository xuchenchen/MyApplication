package com.example.administrator.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/6/29.
 */

public class RectFloatView extends View {

    private float currentX = 300 ;
    private float currentY = 400 ;
    private Paint paint = new Paint() ;

    public RectFloatView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public RectFloatView(Context context,AttributeSet set) {
        // TODO Auto-generated constructor stub
        super(context,set) ;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
//        canvas.drawCircle(currentX, currentY, 15, paint) ;
        paint.setStyle(Paint.Style.STROKE);//空心矩形框
//        paint.setStyle(Style.FILL);//实心矩形框
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(6);
        canvas.drawRect(new RectF( currentX-300, currentY-100,currentX, currentY), paint);
    }

    //当view发生触屏事件时会调用此方法
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub

        currentX = event.getX() ;
        currentY = event.getY() ;

        //通知当前组件重绘自己
        invalidate() ;
        return true;
    }
}
