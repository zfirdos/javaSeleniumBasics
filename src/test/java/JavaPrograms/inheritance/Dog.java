package JavaPrograms.inheritance;

public class Dog extends Animal{
	
	public void eat() {
		System.out.println("This is child: I can eat");
	}
	
	public int add(int a, int b)
	{
		int c = a*b;
		return c;
	}
	
	public void animalNameShow() {
		System.out.println("Name of Animal::"+animalName);
	}
	public void display() {
		System.out.println("I am child class");
		//System.out.println("My name is::"+name);
	}
}
