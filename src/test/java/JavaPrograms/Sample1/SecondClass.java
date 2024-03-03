package JavaPrograms.Sample1;

public class SecondClass {

	public static void main(String[] args) {
		//FirstClass firstDemo  = new FirstClass(); //FirstDemo() -- Default constructor
		int n = new FirstClass().num; //variable calling
		System.out.println(new FirstClass().num);
		System.out.println(n);
		
		new FirstClass().displayValue(); //method calling

	}

}
/*
 * int n = 10; String s = "hhj"
 */
