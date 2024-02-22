package JAVA_Misson_11;


//FigureTest 클래스 정의
public class FigureTest {

	public static void main(String[] args) {
		// 각 도형 클래스의 객체 생성
		Triangle triangle = new Triangle(10, 20);
		Rectangle ractangle = new Rectangle(10, 20);
		Circle circle = new Circle(5);
		Trapezoid trapezoid = new Trapezoid(5, 10, 8);

		// 각 도형의 넓이 출력
		System.out.println("삼각형의 넓이 : " + triangle.getArea());
		System.out.println("사각형의 넓이 : " + ractangle.getArea());
		System.out.println("원형의 넓이 : " + String.format("%.2f", circle.getArea()));
		System.out.println("사다리꼴의 넓이 : " + trapezoid.getArea());
	}
}