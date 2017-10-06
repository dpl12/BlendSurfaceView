package com.example.dpl.blendsurfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by dpl on 2017/8/12 0012.
 */

public class BlendView extends SurfaceView implements SurfaceHolder.Callback {
    private Contanier contanier;
    private Rect rect;
    private Circle circle;
    public BlendView(Context context) {
        super(context);
        contanier=new Contanier();
        rect=new Rect();
        circle=new Circle();
        rect.addChildrenView(circle);
        contanier.addChildrenView(rect);
        getHolder().addCallback(this);
    }
    private Timer timer=null;
    private TimerTask timerTask=null;
    public void startTimer(){
        timer=new Timer();
        timerTask=new TimerTask() {
            @Override
            public void run() {
                Draw();
            }
        };
        timer.schedule(timerTask,100,100);
    }
    public void stopTimer(){
        if(timer!=null){
            timer.cancel();//关闭
            timer=null;
        }
    }
    public void Draw(){
        Canvas canvas=getHolder().lockCanvas();
        canvas.drawColor(Color.WHITE);
        contanier.draw(canvas);
        getHolder().unlockCanvasAndPost(canvas);
    }
    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        startTimer();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        stopTimer();
    }
}
