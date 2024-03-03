package JavaPrograms.Sample1;

public class ConstructorExample {
	int len,bre;
	public ConstructorExample() {
		len =10;
		bre=10;
	}
	
	public ConstructorExample(int len, int bre) {
		//int len; -- duplicate
		len =this.len;
		bre=this.bre;
	}
	
	public int area() {
		return(len*bre);
	}
}
