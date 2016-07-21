package com.kimhg.algo;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0){
			String name = sc.next();
			System.out.println("Hello, "+name+"!");
		}
	}

}
