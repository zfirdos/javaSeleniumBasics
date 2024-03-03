package JavaPrograms.exceptionHandling;

public class ExampleOfUserDefineEx {

	public static void main(String[] args) {
		try {
			throw new UserDefineEx(7);
		}catch(UserDefineEx ex) {
			System.out.println(ex);
		}

	}

}
