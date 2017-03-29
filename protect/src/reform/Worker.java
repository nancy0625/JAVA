package reform;

public class Worker {
	private int ID;
	private String name;
	private double basic;
	private double bonus;
	private double tax;
	

	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBasic() {
		return basic;
	}


	public void setBasic(double basic) {
		this.basic = basic;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public Worker(int iD, String name, double basic, double bonus) {
		
		ID = iD;
		this.name = name;
		this.basic = basic;
		this.bonus = bonus;
	}
	public double getTax(){
		
	  return tax = (basic + bonus - 1600)* 0.15;
		
		
	}
	public double getSalary(){
		return basic + bonus - tax;
	}


	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		Worker worker = new Worker(07,"ะกร๗",1600,500);
		
		System.out.println(worker.name);		
		System.out.println(worker.getSalary());
		System.out.println(worker.getTax());

	}

}
