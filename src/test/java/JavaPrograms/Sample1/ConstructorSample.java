package JavaPrograms.Sample1;

public class ConstructorSample {

	public static void main(String[] args) {
		//int len=10, bre=10;
		//ConstructorExample object = new ConstructorExample();
		ConstructorExample object1 = new ConstructorExample(90,10);
		//ConstructorExample object2 = new ConstructorExample();
		//object.ConstructorExample(); -- This we can not use
		
		//System.out.println("Area: "+object.area());
		
		//System.out.println("Area: "+object1.area());
		
		  int area1 = object1.area();
		  System.out.println("Area "+area1);
		

	}

}
