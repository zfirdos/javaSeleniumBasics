package JavaPrograms.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapFirstEx {

	public static void main(String[] args) {
    Map<String, Integer> mapEx = new HashMap<>();
    mapEx.put("one", 1);
    mapEx.put("two", 2);
    mapEx.put("two", 3);
    mapEx.put("fo", 4);
    System.out.println(mapEx);
    
    mapEx.replace("two", 2, 7);
    System.out.println(mapEx);
    
	/*
	 * mapEx.remove("two"); System.out.println(mapEx);
	 */
    
    
	}

}
