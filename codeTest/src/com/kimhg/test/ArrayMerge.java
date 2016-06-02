package com.kimhg.test;

import java.util.Arrays;

/**
 * 
 * @FileName : ArrayMerge.java
 * @author : kim, hyungun
 * @Date : 2016. 6. 2.
 * @변경이력 :
 * @description :
 */
public class ArrayMerge {
	public static void main(String[] args) {
		int[] arr1 = {8,5,1,4};
		int[] arr2 = {2,9,10,3};
		int[] arrSum;
		
		// with for문
		arrSum = new ArrayMerge().mergeArrays(arr1, arr2);
		System.out.println("Array Merge 1 : "+Arrays.toString(arrSum));
		
		// with arraycopy
		int[] arrSum2 = new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arrSum2, 0, arr1.length);
		System.arraycopy(arr2, 0, arrSum2, arr1.length, arr2.length);
		System.out.println("Array Merge 2 : "+Arrays.toString(arrSum2));
		
		// array sorting(asc)
		for(int i = arrSum.length-1; i>=0; i--){
			for(int j = 0; j<i; j++){
				if(arrSum[j]>arrSum[j+1]){
					int tmpVal = arrSum[j];
					arrSum[j] = arrSum[j+1];
					arrSum[j+1] = tmpVal;
					
					//System.out.println(">> : "+Arrays.toString(arrSum));
				}
				
			}
		}
		System.out.println("Array sorting(asc) : "+Arrays.toString(arrSum));
		
		// array sorting(desc)
		for(int i = arrSum.length-1; i>=0; i--){
			for(int j = 0; j<i; j++){
				if(arrSum[j]<arrSum[j+1]){
					int tmpVal = arrSum[j];
					arrSum[j] = arrSum[j+1];
					arrSum[j+1] = tmpVal;
					
				}
				
			}
		}
		System.out.println("Array sorting(desc) : "+Arrays.toString(arrSum));
	}
	
	public int[] mergeArrays(int[] arrA, int[] arrB) {
		int sumLength = arrA.length+arrB.length;
		int[] arrSum = new int[sumLength];
		 
		for(int i=0; i<sumLength; i++) {
			if(i<arrA.length) {
				arrSum[i] = arrA[i];   
			}else {
				arrSum[i] = arrB[i-arrA.length];
			}
		}
		return arrSum;
	}	
}
