package shape;

public class Rectangle extends Shape {
	double a = 3,b = 4;

	@Override
	public void zhouchang() {
		// TODO Auto-generated method stub
		System.out.println("周长=" +(a+b)*2);

	}
   
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("圆的面积是：" + a*b);

	}

}
