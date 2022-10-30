package main.java.FlyWeightPattern;

public class ThickPen implements Pen{

    final BrushSize brushSize = BrushSize.THICK;  //intrinsic state - shareable(immutable)
    private String color = null;          //extrinsic state - supplied by client
    @Override
    public void draw(String draw) {

        System.out.println("ThickPen class draw() is called and the name of color is " +color );
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }
}
