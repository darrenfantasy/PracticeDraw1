package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint = new Paint();
    RectF rectF = new RectF(200,200,600,600);
    RectF rectFTop = new RectF(200-20,200-20,600,600);
    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF,0,-40,true,paint);
        paint.setColor(Color.RED);
        canvas.drawArc(rectFTop,-50,-120,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF,5,150,true,paint);
    }
}
