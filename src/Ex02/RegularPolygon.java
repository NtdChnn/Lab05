/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;

/**
 *
 * @author notda
 */
public class RegularPolygon {
    private int n;
    private double side,x,y;
    
    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    
    RegularPolygon(int n , double side){
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }
    
    RegularPolygon(int n , double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if(n > 3)
        {
        this.n = n;
        } else System.out.println("! ERROR !");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side > 0)
        {
        this.side = side;
        } else System.out.println("! ERROR !");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter() {
        return n * side;
    }
    
    public double getArea() {
        return (n * side)/(4 * Math.tan(Math.PI/n));
    }
}