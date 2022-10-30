package main.java.FactoryPattern;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String  shape){

        if(shape ==null)return null;

        if (shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        if (shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }
}
