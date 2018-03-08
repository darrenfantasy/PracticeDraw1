package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    private Paint mPaint;
    private Paint mPaint1;
    public Practice2DrawCircleView(Context context) {
        super(context);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);

        mPaint1 = new Paint();
        mPaint1.setColor(Color.BLUE);
        mPaint1.setAntiAlias(true);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        canvas.drawCircle(300,300,150,mPaint);
        mPaint.setStrokeWidth(5f);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(700,300,150,mPaint);
        canvas.drawCircle(300,600,150,mPaint1);
        mPaint.setStrokeWidth(20f);
        canvas.drawCircle(700,600,150,mPaint);

    }
}
