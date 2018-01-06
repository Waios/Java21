package de.merit.azubi.java21.day6;

public class Circle {


    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }



    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
