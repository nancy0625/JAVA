
public class ShapeTest {

	public static void main(String[] args) {
		Shape shape1 = new Circle(6);
		System.out.println(shape1.area());
		System.out.println(shape1.zhouchang());
		shape1 =new Rectangle(3,5);
		System.out.println(shape1.area());
		System.out.println(shape1.zhouchang());

	}

}
