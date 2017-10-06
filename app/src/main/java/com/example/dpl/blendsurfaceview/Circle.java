package com.example.dpl.blendsurfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by dpl on 2017/8/12 0012.
 */

public class Circle extends Contanier {
    private Paint paint=null;
    public Circle(){
        paint=new Paint();
        paint.setColor(Color.YELLOW);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawCircle(300,300,300,paint);
    }
}
