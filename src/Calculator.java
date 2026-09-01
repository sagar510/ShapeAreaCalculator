import shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Shape> shapes;

    public Calculator(){
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public double calculateTotalArea(){
        return shapes.stream().mapToDouble(Shape::calculateArea).sum();
    }
}
