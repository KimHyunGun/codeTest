package com.kimhg.test;

import java.util.Arrays;

public class CodilityLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson cdl = new CodilityLesson();
		
		int[] arr1 = {};
		int ret = cdl.permMissingElemSolution(arr1);
		System.out.println("결과 : "+ret);
	}

	//////////////////////////////////////
	//PermMissingElem
	//////////////////////////////////////
	/**
	A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
	Your goal is to find that missing element.
	Write a function:
	class Solution { public int solution(int[] A); }
	that, given a zero-indexed array A, returns the value of the missing element.
	For example, given array A such that:
	
	  A[0] = 2
	  A[1] = 3
	  A[2] = 1
	  A[3] = 5
	the function should return 4, as it is the missing element.
	
	Assume that:
	
	N is an integer within the range [0..100,000];
	the elements of A are all distinct;
	each element of array A is an integer within the range [1..(N + 1)].
	
	// after sorting...
	{} -> 1
	{2} -> 1
	{1} -> 2
	{2,3} -> 1
	{1,2} -> 3
	{1,3} -> 2
	*/
	public int permMissingElemSolution(int[] A){
		Arrays.sort(A);
		int ret = 0;
		
		if(A.length == 0)
			ret = 1;
		else{
			ret = A[A.length-1]+1;
			for(int i = 0; i < A.length; i++){
				//System.out.println(i+", "+A[i]);
				if(A[i] != i+1){
					ret = A[i]-1;
					break;
				}
			}
		}
		
		return ret;
	}
}
