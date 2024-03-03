package JavaPrograms.Sample1;

import java.util.Scanner;

public class ScannerClassConcept {

	public static void main(String[] args) {
		
		Scanner inputValue = new Scanner(System.in);
		System.out.println("Enter the number::");
		int num = inputValue.nextInt();
		System.out.println("Number is:" + num);
		System.out.println("Enter Name:");
		String s = inputValue.nextLine();
		System.out.println("NAme is:" + s);
	}
}
