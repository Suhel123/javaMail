package com.hellow;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapiteration {

	
	public static void main(String[] args) {
		
		Map<Integer, String>mp=new HashMap<Integer, String>();
		
		mp.put(1, "a");
		mp.put(2,"b");
		mp.put(4,"c");
		mp.put(9,"d");
		mp.put(5,"f");
		Set set=mp.keySet();
		for (Iterator<String> iterator=set.iterator();iterator.hasNext(););
			
		  
	}
}
