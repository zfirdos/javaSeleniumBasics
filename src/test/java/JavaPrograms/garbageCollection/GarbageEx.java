package JavaPrograms.garbageCollection;

public class GarbageEx {

	public static void main(String[] args) {
		GarbageEx ex5 = new GarbageEx();
		
		ex5 = null;
		System.gc();
		
		
	}
	public void finalize()
	{
		System.out.println("Done");
	}

}
