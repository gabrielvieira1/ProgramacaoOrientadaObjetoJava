package MapHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSimples {
	
	public static void main(String[] args) {
		Map<Object, ArrayList> mapAnimals = new HashMap<Object, ArrayList>();
		ArrayList<String> obj = new ArrayList<String>(); 
		ArrayList<String> obj2 = new ArrayList<String>(); 
		
		obj.add("Melyssa");
		obj.add("Gabriel");
		obj.add("Thiago");
		
		obj2.add("Pedro");
		
		mapAnimals.put(new Integer(1), obj);
		//mapAnimals.put(new Integer(2), obj2);
		mapAnimals.put(2, obj2);
		
	/*	mapAnimals.put(new Integer(2), "Coelho"); 
		mapAnimals.put(new Integer(1), "Bode"); 
		mapAnimals.put(new Integer(3), "Cachorro"); 
		mapAnimals.put(new Integer(5), "Gato"); 
		mapAnimals.put(new Integer(4), "Vaca"); */
		
		System.out.println(mapAnimals);
		
		
		System.out.println(mapAnimals.get(3));
		
		Set s = mapAnimals.entrySet();
		
		Iterator it = s.iterator();
		
//		while (it.hasNext()) {
//			Map.Entry m = (Map.Entry) it.next();
//			int key = (Integer) m.getKey();
//			String value = (String) m.getValue();
//			System.out.println("Key: " + key + " value: " + value);
//		}
		
		for(Map.Entry<Object, ArrayList> entry : mapAnimals.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		}
		
		
	}

}
