package JavaPrograms.Sample1;

public class FirstDemo {

	int num=5; //data member
	
	public void display() {};//method declaration
	
	private void displayValue() { //member function
		System.out.println("Value "+num);
	} //method definition
	
	
	public static void main(String[] args) {
		/*
		 * FirstDemo firstDemo; //object declaration firstDemo = new FirstDemo(); //
		 * object initialization
		 */
		FirstDemo firstDemo  = new FirstDemo(); //FirstDemo() -- Default constructor
		int n = firstDemo.num; //variable calling
		System.out.println(firstDemo.num);
		System.out.println(n);
		
		firstDemo.displayValue(); //method calling
	}
}
