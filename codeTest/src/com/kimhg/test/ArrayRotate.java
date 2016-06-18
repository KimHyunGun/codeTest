package com.kimhg.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
		ArrayRotate ar = new ArrayRotate();
		
		int[] arr1 = {5,3,1,8,9};
		int rcnt = 3;
		int[] ret = ar.solution(arr1, rcnt);
		System.out.println("결과 : "+Arrays.toString(ret));
		
		/*
		//OddOccurrencesInArray Submitted in: Java
		int[] arr2 = {7, 9, 9, 7, 9, 3, 9, 7, 7, 8, 3};
		System.out.println(Arrays.toString(arr2));
		int ret2 = ar.solution2(arr2);
		System.out.println("결과 : "+ret2);
		*/
		
		// random
		//ar.getRandomArray(10, 5);
		
	}
	
	////
	public int[] solution(int[] A, int K){
	
		//https://codility.com/demo/results/trainingAFYB37-YKR/
		int N = A.length;
		
		// K = 0, N <=1 대응
		if (N <= 1 || K == 0) {
			return A;
		}

		// K >= N 대응
		K = K % N;

		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			if (i+K < N) {
				result[i + K] = A[i];
			} else {
				result[i + K - N] = A[i];
			}
		}

		return result;

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
		/*
		List list = new ArrayList();
		for(int i = 0; i < A.length; i++){
			if(list.contains(A[i])){
				//System.out.println(i+", "+A[i]);
				list.remove(new Integer(A[i]));			
			}else{
				list.add(A[i]);					
			}
		}
		*/
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < A.length; i++){
			Integer arrVal = A[i];
			if(map.containsKey(arrVal)){
				map.put(arrVal, map.get(arrVal)+1);
			}else{
				map.put(arrVal, 1);
			}
		}
		
		for(Integer key : map.keySet()){
			if(map.get(key) % 2 == 1){
				ret = key;
				break;
			}
		}
		return ret;
	}

	public int[] getRandomArray(int size, int range){
		
		int[] aa = new int[size];
		Random ran = new Random();
		for(int i = 0; i < size; i++){
			aa[i] = ran.nextInt(range)+1;
		}
		//System.out.println(Arrays.toString(aa));
		return aa;
	}
}
