package shape.impls;

import enums.ShapeType;
import shape.Shape;

public class Triangle implements Shape {

    private int base;
    private int height;

    private Triangle(Builder builder){
        if(builder.base <= 0) throw new RuntimeException("Triangle base can not be non-postive");
        if(builder.height <= 0) throw new RuntimeException("Triangle height can not be non-postive");

        this.base = builder.base;
        this.height = builder.height;
    }

    @Override
    public double calculateArea() {
        return 0.5f * base * height;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.TRIANGLE;
    }

    public static class Builder{
        private int base;
        private int height;

        public Builder base(int base){
            this.base = base;
            return this;
        }

        public Builder height(int height){
            this.height = height;
            return this;
        }

        public Triangle build(){
            if(this.base == 0) throw new RuntimeException("Triangle base is required");
            if(this.height == 0) throw new RuntimeException("Triangle height is required");
            return new Triangle(this);
        }
    }
}
