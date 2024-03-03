package JavaPrograms.Collections;

import java.util.ArrayList;
import java.util.List;

/*
 * Description: This class shows the example of List
 * Author: Zainab Firdos
 * Date: 3/1/2024
 * */
public class ListFirstEx {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("banana");
		fruits.add("1");
		
		System.out.println(fruits);
		//It is adding grapes value in place of mango
		fruits.add(1,"grapes");
		System.out.println(fruits);
		
		fruits.remove(2);
		System.out.println(fruits);
		 
	}

}
