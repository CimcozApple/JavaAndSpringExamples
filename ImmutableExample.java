package com.annotation.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Varun Adhikari
 */
public class ImmutableExample{
	public static void main(String[] args) {
		Map<Integer,String> map =  new HashMap<>();
		map.put(1, "1");
		map.put(2, "two");
		map.put(1, "one"); //this will override the previous value
		ImmutableClass imObj = new ImmutableClass("Test", map);
		
		System.out.println("before removal " + imObj.getMap());
		
		Map<Integer,String> map2 = imObj.getMap();
		map2.remove(2);
		
		System.out.println("after removal " + imObj.getMap());
	}
}

final class ImmutableClass{

	private final String value;
	private final Map<Integer,String> map;
	
	ImmutableClass(String value,Map<Integer,String> map){
		this.value = value;
		this.map = map;
	}
	
	public String getValue() {
		return value;
	}

	public Map<Integer, String> getMap() {
		Map<Integer,String> clonedMap = new HashMap<>();
		clonedMap.putAll(map);
		return clonedMap;
	}	
	
}
