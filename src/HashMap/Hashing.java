package HashMap;
import java.util.*;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map=new HashMap<>();
		
		// insertion
		map.put("india", 165);
		map.put("china", 179);
		map.put("Us", 121);
		System.out.println(map);
		
		map.put("china", 100);
		System.out.println(map);
//----------------------------------------
		// searching
		if(map.containsKey("china")) {
			System.out.println("key is present in map");
		}
		else {
			System.out.println("key is not present in map");
		}
		// get value
		System.out.println(map.get("china")); // key exist
		System.out.println(map.get("londom")); // key does't exist
//---------------------------------------- -----------
		//for loop
		//for (int val : arr)
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
//-----------------------------------------------------
			Set<Sting> keys =map.keySet();
			for (String key : keys) {
				System.out.println(key + " " + map.get(key));
			}
		}
	}

}
