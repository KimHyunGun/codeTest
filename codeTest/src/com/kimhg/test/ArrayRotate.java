package com.kimhg.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 
 * @FileName : ArrayRotate.java
 * @author : kim, hyungun
 * @Date : 2016. 6. 2.
 * @변경이력 :
 * @description : ArrayRotate
 */
public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3, 8, 9, 7, 6};
		int rcnt = 3;
		int[] ret = new ArrayRotate().solution(arr1, rcnt);
		//System.out.println("결과 : "+Arrays.toString(ret));
		
		//OddOccurrencesInArray Submitted in: Java
		int[] arr2 = {9, 3, 9, 3, 9, 7, 9};
		int ret2 = new ArrayRotate().solution2(arr2);
		System.out.println("결과 : "+ret2);
		
	}
	
	////
	public int[] solution(int[] arr, int k){
		for(int i = 1; i<=k; i++){
			int lastIdxNum = arr[arr.length-1];
			int[] tmpArr = new int[arr.length-1];
			for(int j = 0; j<arr.length-1; j++){
				tmpArr[j] = arr[j]; 
			}
			
			for(int g = 0; g<arr.length; g++){
				if(g == 0)
					arr[0] = lastIdxNum;
				else
					arr[g] = tmpArr[g-1];
			}
			
			//System.out.println(i+" >> "+Arrays.toString(arr));
		}
		return arr;
	}

	public int solution2(int[] A){
		int ret = 0;
		/*
		for(int i = 0; i<A.length; i++){
			for(int j = i+1; j<A.length; j++){
				if(A[i] > 0 && A[i] == A[j]){
					//System.out.println(i+", "+j+" >> "+A[i]+", "+A[j]);
					A[i] = -(A[i]);
					A[j] = -(A[j]);
					break;
				}
			}
			//System.out.println(i+" >> "+A[i]);
			//
		}

		for(int g = 0; g<A.length; g++){
			if(A[g]>0) return A[g];
		}
		*/
		List list = new ArrayList();
		for(int i = 0; i < A.length; i++){
			if(list.contains(A[i])){
				//System.out.println(i+", "+A[i]);
				list.remove(new Integer(A[i]));			
			}else{
				list.add(A[i]);					
			}
		}
		
		//System.out.println(list.get(0));
		return (int)list.get(0);
	}
}
