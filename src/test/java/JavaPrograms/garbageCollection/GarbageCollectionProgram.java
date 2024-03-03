package JavaPrograms.garbageCollection;

public class GarbageCollectionProgram {

	  
	public static void main(String[] args) {
		GarbageCollectionProgram c5=new GarbageCollectionProgram();  
		GarbageCollectionProgram c8=new GarbageCollectionProgram();  
		//GarbageCollectionProgram s10=new GarbageCollectionProgram();
		  c5=null;  //null refernce
		  c8=null; 
		  
		  //s8 = s10; // assigning a reference to anotther
		  
		  
		  //new GarbageCollectionProgram(); //anonymous object
		  
		  System.gc();  

	}
	public void finalize(){
		System.out.println("object is removed");
		}

}
