package com.kimhg.algo;

public class NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumSum ns = new NumSum();
		int num = 9;
		System.out.println("1~"+num+" sum : "+ns.Sum(num));
	}

	public int Sum(int num){
		int sum = 0;
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		if(num % 2 ==0)
			sum = (1+num) * (num/2);
		else
			sum = (1+num) * (num/2) + (num/2)+1;

/*

sdfsdf

*/		
		return sum;
	}
}