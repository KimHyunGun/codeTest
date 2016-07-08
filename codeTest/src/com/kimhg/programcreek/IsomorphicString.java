package com.kimhg.programcreek;

import java.util.*;

public class IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsomorphicString iso = new IsomorphicString();
		String s = "e1gg";
		String t = "22dd";
		
		System.out.println( "IsomorphicString 결과 : " + iso.isIsomorphic(s, t) );
	}
	
	public boolean isIsomorphic(String s, String t){
		Map<Character, Character> map = new HashMap<Character, Character>();
		
		for(int i=0; i<s.length(); i++){
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			 
			if(map.containsKey(c1)){
				if(map.get(c1)!=c2)// if not consistant with previous ones
					return false;
			}else{
				if(map.containsValue(c2)) //if c2 is already being mapped
	                return false;
				map.put(c1, c2);
			}
		}
	 
		return true;
	}
}
