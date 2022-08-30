package com.briup.java.day5;

class point{
    double x,y;

    public point(double _x,double _y){
        x=_x;
        y=_y;
    }
    public double getDistance(point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}

public class TestPoint {
    public static void main(String[] args) {
        point p = new point(3.0,4.0);
        point origin = new point(0.0,0.0);
        System.out.println(p.getDistance(origin));
    }
}
