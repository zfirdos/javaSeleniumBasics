package JavaPrograms.inheritance;

public class Animal2 {
	String name; //declare
	String animalName;
	public void eat() {
		System.out.println("This is parent: I can eat");
	}
	
	public int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	public void eat12() {
		System.out.println("This is parent: I can eat");
	}
	
	protected void protectEx() {
		System.out.println("This is parent: protected");
	}
}
