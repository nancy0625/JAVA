
public class Circle extends Shape {
	private double r;
	private final double PI = 3.14;

	@Override
	public double zhouchang() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}
	public Circle(double r) {
		super();
		this.r = r;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2*PI*r;
	}

}
