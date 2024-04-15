package naman;

public class PersonNandAnew {
	
	String name;
	int age;
	
	public PersonNandAnew(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void showDetails() {
		System.out.println("Name: "+name +", Age: "+age);
	}

	public static void main(String[] args) {
		PersonNandAnew p1 = new PersonNandAnew("Naman",20);
		PersonNandAnew p2 = new PersonNandAnew("Piyush",21);
		p1.showDetails();
		p2.showDetails();
	}

}
