package Ex02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class Exercise02 {
    public static void main(String[] args) {
        RegularPolygon defaultPolygon = new RegularPolygon();
        System.out.println("Default Polygon perimeter : " + defaultPolygon.getPerimeter());
        System.out.println("Default Polygon area : " + defaultPolygon.getArea());
        
        RegularPolygon secondPolygon = new RegularPolygon(6,4);
        System.out.println("Second Polygon perimeter : " + secondPolygon.getPerimeter());
        System.out.println("Second Polygon area : " + secondPolygon.getArea());
        
        RegularPolygon thirdPolygon = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Third Polygon perimeter : " + thirdPolygon.getPerimeter());
        System.out.println("Third Polygon area : " + thirdPolygon.getArea());
    }
}
