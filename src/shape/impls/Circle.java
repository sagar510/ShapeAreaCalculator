package shape.impls;

import enums.ShapeType;
import shape.Shape;

public class Circle implements Shape {

    private final float pi = 3.14f;
    private int r;

    public Circle(int r){
        if(r <= 0) throw new RuntimeException("Circle radius can not be non-postive");
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return pi * r * r;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }
}
