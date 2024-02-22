package JAVA_Misson_11;

//Triangle 클래스 정의
public class Triangle extends Shape {
//필드: 밑변, 높이
	private double base;
	private double height;

//생성자: 밑변과 높이를 매개변수로 받아 초기화
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

//draw() 메서드 구현: 삼각형을 그리는 코드
	public void draw() {
		// 삼각형을 그리는 코드 (생략)
	}

//resize() 메서드 구현: 삼각형의 크기를 변경하는 코드
	public void resize() {
		// 삼각형의 크기를 변경하는 코드 (생략)
	}

//getArea() 메서드 구현: 삼각형의 넓이를 계산하여 반환
	public double getArea() {
		return base * height / 2;
	}
}