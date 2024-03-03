package JavaPrograms.exceptionHandling;

public class UserDefineEx extends Exception{
	int x;
	UserDefineEx(int y)
	{
		x=y;
	}
	public String toString1() throws Exception{
		return("Exception value"+x);
	}
}
