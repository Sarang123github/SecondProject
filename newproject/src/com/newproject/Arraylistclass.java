package com.newproject;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylistclass {

	public static void main(String[] args) {
	
		List<String> asList = Arrays.asList("sarang","sagar","aai");
		Iterator<String> iterator = asList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());

	}

}
}