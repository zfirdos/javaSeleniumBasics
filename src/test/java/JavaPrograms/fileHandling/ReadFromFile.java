package JavaPrograms.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\Example\\files\\file11.txt");
		Scanner read = new Scanner(file);
		while(read.hasNextLine()) //To read multiple files
		{
			String readFileData = read.nextLine();
			System.out.println(readFileData);
		}
		//To read single line of file
		//String readFileData = read.nextLine();
		System.out.println("Read operation is done");
		read.close();
	}

}
