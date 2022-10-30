package main.java.FlyWeightPattern;

/*
Flyweight design pattern is a Structural design pattern.
Flyweight design pattern is used when we need to create a lot of Objects of a class.
Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or
embedded systems, flyweight design pattern can be applied to reduce the load on memory by sharing objects .
Here object is immutable but in Singleton pattern , object is mutable .To apply flyweight pattern, we need to divide
Object property into intrinsic and extrinsic properties.
In Flyweight by making a request we try to reuse as much objects as possible by sharing them. New required object
will be created if we don't find such one. It's being done for resource optimization.
https://howtodoinjava.com/design-patterns/structural/flyweight-design-pattern/
*/

public class Main {

    public static void main(String[] args) {

        Pen pen1= PenFactory.getMediumPen("Blue");
        pen1.draw("Sonakshi");
        System.out.println(pen1.hashCode());
        Pen pen2= PenFactory.getMediumPen("Yellow");
        pen2.draw("Sonakshi");
        System.out.println(pen2.hashCode());
        Pen pen3= PenFactory.getMediumPen("Yellow");
        pen3.draw("Sonakshi");
        System.out.println(pen3.hashCode());
    }
}
