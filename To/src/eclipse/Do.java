package eclipse;

public class Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		Dog dog = new Dog();
		obj1.eat();
		obj2.eat();
		dog.watchDoor();
		
		Animal animal = dog;
		if (animal instanceof Dog){
			Dog dogs = (Dog)animal;
		}else{
			System.out.println("无法进行类型转换 转换成dog类型"
					+ "");
		}
		if (animal instanceof Person){
		Person per = (Person)animal;
		}else{
			System.out.println("无法进行类型转换,转换成Person类型");
		}
	}

}
