package com.rays.maps;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {
   public static void main(String[] args) {
	   Map m = new HashMap();
	   m.put(1, "Ramesh");
	   m.put(3, 'a');
	   m.put(2, true);
	   m.put(0, 4.5);
	   m.put(6,7);
	   System.out.println(m);
	   System.out.println(m.entrySet());
	  // m.clear();
	  // System.out.println(m);
	   System.out.println(m.containsKey(0));
	   System.out.println(m.containsValue('a'));
	   System.out.println(m.get(0));
	   System.out.println(m.isEmpty());
	   System.out.println(m.keySet());
	   m.remove(1);
	   System.out.println(m);
	   System.out.println(m.size());
	   System.out.println(m.values());
	
}
}
