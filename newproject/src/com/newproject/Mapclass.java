package com.newproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Mapclass {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(101 , "sarang");
		map.put(102 , "sagar");
		map.put(103 , "babarao");
		
		Set<Integer> Set = map.keySet();
		
		Iterator<Integer> itr = Set.iterator();
		
		while(itr.hasNext()) {
			
			Integer key = itr.next();
			
			System.out.println( key+ "  "  +"  "+  map.get(key) );
			
		}
		
	

	}

}
