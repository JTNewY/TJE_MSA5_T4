package JAVA_Misson_11;

//Trapezoid 클래스 정의
public class Trapezoid extends Shape {
//필드: 윗변, 아랫변, 높이
	private double top;
	private double bottom;
	private double height;

//생성자: 윗변, 아랫변, 높이를 매개변수로 받아 초기화
	public Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}

//draw() 메서드 구현: 사다리꼴을 그리는 코드
	public void draw() {
	}

//resize() 메서드 구현: 사다리꼴의 크기를 변경하는 코드
	public void resize() {
	}

//getArea() 메서드 구현: 사다리꼴의 넓이를 계산하여 반환
	public double getArea() {
		return (top + bottom) / 2 * height;
	}
}
