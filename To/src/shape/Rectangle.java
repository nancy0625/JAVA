package shape;

public class Rectangle extends Shape {
	double a = 3,b = 4;

	@Override
	public void zhouchang() {
		// TODO Auto-generated method stub
		System.out.println("�ܳ�=" +(a+b)*2);

	}
   
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Բ������ǣ�" + a*b);

	}

}
