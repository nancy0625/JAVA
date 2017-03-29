package shape;

public class Cirle extends Shape {
	 double  r = 5,π = 3.14;

	@Override
	public void zhouchang() {
		// TODO Auto-generated method stub
		System.out.println("周长是：" + 2*π*r);

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("面积是：" + π*r*r);

	}

}
