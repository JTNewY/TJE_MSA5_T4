package Shape_Q10;

public class ShapeTest {
      public static void main(String[] args) {
    	    Triangle triangle = new Triangle(20, 10);
            Rectangle rectangle = new Rectangle(20, 10);
            Circle circle = new Circle(5);
            Trapezoid trapezoid = new Trapezoid(10, 20, 6);

            System.out.println("삼각형의 넓이 : " + triangle.getArea());
            System.out.println("사각형의 넓이 : " + rectangle.getArea());
            System.out.println("원형의 넓이 : " + circle.getArea());
            System.out.println("사다리꼴의넓이 : " + trapezoid.getArea());
        }
	}

