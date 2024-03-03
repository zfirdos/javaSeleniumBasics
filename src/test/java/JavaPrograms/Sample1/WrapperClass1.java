package JavaPrograms.Sample1;

public class WrapperClass1 {

	//converting data type into object
	public static void main(String[] args) {
		int a=20; //primitive data type
		Integer i= Integer.valueOf(a); //wrapper class - object
		
		Integer z= a;
		String s = Integer.toString(a);
		System.out.println(s+" "+a+" "+i+" "+z);
	}

}
