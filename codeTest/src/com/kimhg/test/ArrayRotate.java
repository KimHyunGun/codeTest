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
		int[] ret = ar.cyclicRotationSolution(arr1, rcnt);
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
	
	//https://codility.com/demo/results/trainingAFYB37-YKR/
	public int[] cyclicRotationSolution(int[] A, int K){
	
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
	
	// https://codility.com/demo/results/trainingCEMZXD-YZ7/
	public int[] cyclicRotationSolution2(int[] A, int K) {
		// write your code in Java SE 8
		
		int size = A.length;
		if(size == 0 || K == 0)
		    return A;
		    
		K = K % size;
		
		for(int i = 0; i < K; i++){
			for(int j = size-1; j > 0; j--){
			    //System.out.println(A[j]);
			    int tmp = A[j];
			    A[j] = A[j-1];
			    A[j-1] = tmp;
			}
			//System.out.println(i+", "+Arrays.toString(A));
		}
		
		return A;
	}
	
	//https://codility.com/demo/results/trainingBX2XJH-97Q/
	public int[] cyclicRotationSolution3(int[] A, int K) {
		int[] result = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			result[(i + K) % A.length] = A[i];
		}
		
		return result;
	}

public int solution2(int[] A){
		/*
		// https://codility.com/demo/results/training29WK37-5M4/
		int ret = 0;
        Arrays.sort(A);
        
        int beforeVal = 0;
        int chCnt = 0;
        for(int i = 0; i < A.length; i++){
            if(i == 0 || A[i] == beforeVal){
                beforeVal = A[i];
                chCnt++;
                continue;
            }
            
            //System.out.println(i+", "+beforeVal+", "+chCnt);
            if(A[i] != beforeVal){
                if(chCnt % 2 == 1)
                    return beforeVal;
                else{
                    chCnt = 1;
                    beforeVal = A[i];
                }        
            }  
        }
        return beforeVal;
		*/
		
		int ret = 0;
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
