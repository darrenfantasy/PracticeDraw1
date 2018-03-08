package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint();
    Path path = new Path();
    RectF rectF = new RectF();
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(100,100,100,600,paint);
        canvas.drawLine(100,600,800,600,paint);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(150,550,250,600);
        canvas.drawRect(rectF,paint);

        rectF.set(300,300,400,600);
        canvas.drawRect(rectF,paint);

        rectF.set(450,200,550,600);
        canvas.drawRect(rectF,paint);

        rectF.set(600,150,700,600);
        canvas.drawRect(rectF,paint);

        paint.setTextSize(20);
        paint.setColor(Color.WHITE);
        canvas.drawText("text",175,620,paint);
        canvas.drawText("text",325,620,paint);
        canvas.drawText("text",475,620,paint);
        canvas.drawText("text",625,620,paint);

    }
}
