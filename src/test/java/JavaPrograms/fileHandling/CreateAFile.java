package JavaPrograms.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
		File file = new File("D:\\Example\\files\\file6.txt");
		try {
			/*
			 * if(file.createNewFile()) {
			 * System.out.println("File"+file.getName()+"created successfully"); } else {
			 * System.out.println("File already created"); }
			 */
			System.out.println("Hello");
			
			  if(file.exists()) { System.out.println("Name of file::"+file.getName());
			  System.out.println("path of file::"+file.getAbsolutePath());
			  System.out.println("Can able to read::"+file.canRead());
			  System.out.println("Can able to write::"+file.canWrite()); } else {
			  System.out.println("File not there"); }
			 
			
			/*
			 * file.delete(); System.out.println("File deleted");
			 */
			
		} catch (Exception e) {
			System.out.println("The is error");
			e.printStackTrace();
		}
		
	}

}
