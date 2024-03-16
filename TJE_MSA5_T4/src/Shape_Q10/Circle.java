package Shape_Q10;

public class Circle {
	  private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

		@Override
		public String toString() {
			return "Circle [radius=" + radius + "]";
		}
}
