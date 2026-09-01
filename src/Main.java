import shape.Shape;
import shape.impls.Circle;
import shape.impls.Triangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Shape circle = new Circle(5); //78.5
    Shape triangle = new Triangle.Builder() //6
                            .base(3)
                            .height(4)
                            .build();

    Calculator calculator = new Calculator();
    calculator.addShape(circle);
    calculator.addShape(triangle);

    double totArea = calculator.calculateTotalArea();

    System.out.println(totArea);
}
