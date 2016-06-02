package com.kimhg.test;

import java.util.Arrays;

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
		
		System.out.println("결과 : "+Arrays.toString(ret));
	}

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
}
