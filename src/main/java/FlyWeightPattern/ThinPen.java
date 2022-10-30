package main.java.FlyWeightPattern;

public class ThinPen implements Pen{

    final BrushSize brushSize = BrushSize.THIN;  //intrinsic state - shareable(immutable)
    private String color = null;          //extrinsic state - supplied by client
    @Override
    public void draw(String draw) {

        System.out.println("ThinPen class draw() is called and the name of color is " +color );
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }
}
