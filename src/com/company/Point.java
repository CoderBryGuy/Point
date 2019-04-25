package com.company;

public class Point {

    private int x, y;

    public Point(){
        this(0,0);
    }

   public  Point(int x, int y){
       this.x = x;
       this.y = y;
    }

    public int getX(){return x;}

    public int getY(){return y;}

    public void setX(int x){this.x = x;}

    public void setY(int y){this.y = y;}

    public double distance(){

       return distance(0,0);

    }

    public double distance(int x, int y){

        Point b = new Point(x, y);

        double distance = Math.sqrt(
                ((b.getX() - this.x)*(b.getX() - this.x))
                        + ((b.getY() - this.y) * (b.getY() - this.y)));

        return distance;

    }

    public double distance(Point anotherPoint){

        return distance(anotherPoint.getX(), anotherPoint.getY());

    }
}
