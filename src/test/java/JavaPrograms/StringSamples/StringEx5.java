package JavaPrograms.StringSamples;

public class StringEx5 {

	public static void main(String[] args) {
		String s1 = "Hello"; // immutable
		System.out.println("Original String:"+s1);
		System.out.println(s1.concat("World"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println("Original String:"+s1.length());
		System.out.println();
		System.out.println();
		
		// mutable
		StringBuilder s2 = new StringBuilder("Apple"); //non-synchronized and not thread safe, more efficient
		System.out.println("Original String:"+s2);
		System.out.println(s2.append("World"));
				
		System.out.println("Original String:"+s2);
		
		System.out.println();
		System.out.println();
		
		// mutable
		java.lang.StringBuffer s3 = new java.lang.StringBuffer("Mango"); //Synchronized and thread-safe, less efficient
		System.out.println("Original String:"+s3);
		System.out.println(s3.append("Apple"));
				
		System.out.println("Original String:"+s3);
	}

}
