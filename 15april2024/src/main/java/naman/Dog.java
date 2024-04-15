package naman;

public class Dog {
	
	String name;
	String breed;
	
	public Dog(String name, String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	
	public void showDetails() {
		System.out.println("Name: "+name +", Breed: "+breed);
	}
	public void setName(String name) {
		this.name=name;
	}
	public void getName() {
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("Sheru","labra");
		Dog d2 = new Dog("kallu","pitbull");
		d1.showDetails();
		d2.showDetails();
		d2.setName("tommy");
		d1.setName("tullu");
		d1.showDetails();
		d2.showDetails();
	}

}
