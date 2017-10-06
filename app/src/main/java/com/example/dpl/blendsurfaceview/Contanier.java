package com.example.dpl.blendsurfaceview;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dpl on 2017/8/12 0012.
 */
//提供一容器，包含多个view
public class Contanier {
    private List<Contanier> children =null;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    private float x=0,y=0;
    public Contanier(){
        children=new ArrayList<Contanier>();
    }
    public void childrenView(Canvas canvas){}
    public void draw(Canvas canvas){
        canvas.save();
        canvas.translate(getX(),getY());//移动位置
        childrenView(canvas);
        for(Contanier c:children){
            c.draw(canvas);
        }
        canvas.restore();
    }
    public void addChildrenView(Contanier child){
        children.add(child);
    }
    public void removeChildrenView(Contanier child){
        children.remove(child);
    }
}
