
public class Rectangle extends Shape {
	double a,b;

	@Override
	public double zhouchang() {
		// TODO Auto-generated method stub
		return 2*(a+b);
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return  a*b;
	}

}
