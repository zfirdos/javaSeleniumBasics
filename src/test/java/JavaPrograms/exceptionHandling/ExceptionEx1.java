package JavaPrograms.exceptionHandling;

public class ExceptionEx1 {

	//FileInputStream i = new FileInputStream("D:/file.txt");
	public static void main(String[] args) {
		int arr[] = {10,2,3};
		System.out.println("Hello");
		System.out.println(10);
		
		System.out.println("Hello1222");
		try {
			System.out.println(10/0); //Arithmetic
			System.out.println(arr[6]); //arrayIndex
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			//shutdown activity
			System.out.println("Helloooooo");
		}
		
		/******???**??/
		 * 
		 */
		try {
			System.out.println(10/0); //Arithmetic
			System.out.println(arr[6]); //arrayIndex
			
		}finally {
			//shutdown activity
			System.out.println("Helloooooo");
		}
		
	}
	
	public void method1() throws Exception {
		
	}

}
