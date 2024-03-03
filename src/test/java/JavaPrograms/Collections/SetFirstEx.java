package JavaPrograms.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetFirstEx {

	public static void main(String[] args) {
		Set<Integer> setVal = new HashSet<>();
		setVal.add(1);
		setVal.add(3);
		setVal.add(6);
		setVal.add(2);
		setVal.add(8);
		setVal.add(5);
		System.out.println(setVal);
		
		/*
		 * setVal.remove(6); System.out.println(setVal);
		 */
		
		Iterator<Integer> io = setVal.iterator();
		while(io.hasNext())
		{
			System.out.println(io.next());
		}
		

	}

}
