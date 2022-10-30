package main.java.FlyWeightPattern;

public class MediumPen implements Pen{

    final BrushSize brushSize = BrushSize.MEDIUM;  //intrinsic state - shareable(immutable)
    private String color = null;          //extrinsic state - supplied by client
    @Override
    public void draw(String draw) {

        System.out.println("MediumPen class draw() is called and the name of color is " +color );
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }


}
