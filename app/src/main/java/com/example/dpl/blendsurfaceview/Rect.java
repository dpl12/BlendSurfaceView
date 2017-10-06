package com.example.dpl.blendsurfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by dpl on 2017/8/12 0012.
 */

public class Rect extends Contanier {
    private Paint paint=null;
    public Rect(){
        paint=new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawRect(300,300,800,800,paint);
        this.setX(this.getX()+10);
        this.setY(this.getY()+10);
    }
}
