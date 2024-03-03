package JavaPrograms.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("D:\\Example\\files\\file11.txt");
		file.write("This is my test file that is created");
		System.out.println("Write oprtion has been performed successfully");
		file.close();

	}

}
