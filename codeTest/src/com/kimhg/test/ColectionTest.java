package com.kimhg.test;

import java.util.*;

public class ColectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColectionTest co = new ColectionTest();
		
		List<String> dataList = new ArrayList<String>();
		
		dataList.add("cccc");
		dataList.add("bbbb");
		dataList.add("aaaa");
		dataList.add("bbbb");
		dataList.add("cccc");
		dataList.add("cccc");
		dataList.add(2, "xxxx");
		
		for(String s : dataList)
			System.out.print(s+", ");
		
		co.uniqList1(dataList);		
		co.uniqList2(dataList);		
	}

	// with HashSet
	public void uniqList1(List<String> list){
		Set<String> uniqList = new HashSet<>(list);
		System.out.println(">> with HashSet ---");
		for(String s : uniqList){
			System.out.println(">> " + s);
			
		}
	}

	// with HashSet
	public void uniqList2(List<String> list){
		Set<String> uniqList = new TreeSet<>(list);
		System.out.println(">> with TreeSet ---");
		for(String s : uniqList){
			System.out.println(">> " + s);
			
		}
	}
}
