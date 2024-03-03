package JavaPrograms.Sample1;

public class WrapperClass2 {
	//converting object into datatype
	public static void main(String[] args) {
			Integer a = new Integer(2); //object
			int int1 = a.intValue(); //explicitly
			int z = a; // unboxing, which is at compile time
			System.out.println(a+" "+int1+" "+z);		
	}

}
