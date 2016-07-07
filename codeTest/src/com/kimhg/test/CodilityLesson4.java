
package com.kimhg.test;
import java.util.*;

public class CodilityLesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson4 cdl = new CodilityLesson4();
		//FrogRiverOne
		int[] A = {1,3,1,4,2,3,5,4};
		int X = 6;
		int ret = cdl.FrogRiverOneSolution(X, A);
		System.out.println("FrogRiverOne 결과 : "+ret);
		
		//PermCheck
		int[] B = {2,4,3,1,5};
		int ret2 = cdl.PermCheck(B);
		System.out.println("PermCheck 결과 : "+ret2);
		
		//MissingInteger
		int[] C = {1,3,6,4,2,1};
		int ret3 = cdl.MissingInteger(C);
		System.out.println("MissingInteger 결과 : "+ret3);

		//MaxConuters
		int[] D = {1,3,1,4,2,3,5,4};
		int Y = 6;
		int[] ret4 = cdl.MaxCounters(Y, D);
		System.out.println("MaxConuters 결과 : "+ret4);
	}

	//////////////////////////////////////
	//FrogRiverOne
	//////////////////////////////////////
	/**
	*/
	public int FrogRiverOneSolution(int X, int[] A){
		int result = -1;
		int xSum = 0;
		for(int i = 1; i <= X; i++){
			xSum += i;
		}
		//System.out.println(xSum);
		boolean[] existCheck = new boolean[X+1];
		int positionSum = 0;
		for(int j = 0; j < A.length; j++){
			if(existCheck[A[j]] == true)
				continue;
			else
				existCheck[A[j]] = true;
			positionSum += A[j];
			if(positionSum == xSum)
				return j;
		}
		return result;
	}
	
	/**
	 * PermCheck - 100%
	 *  - https://codility.com/demo/results/trainingJYGWAR-JSY/
	 * @param A
	 * @return
	 */
	public int PermCheck(int A[]){
		/*
		//https://codility.com/demo/results/training568VBA-VRR/
        int ret = 1;
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++){
            if(A[i] != i+1)
                return 0;
        }
        
        return ret;
        */
      
		// write your code in Java SE 8
		// https://codility.com/demo/results/trainingDX5HFF-SVS/
		boolean[] chArr = new boolean[A.length];
        for(int i = 0; i < A.length; i++){
            //totalSum1 += i+1;
        	//System.out.println(A[i]);
        	if(A[i] > A.length || chArr[A[i]-1])
        		return 0;
        	else
        		chArr[A[i]-1] = true;
        }
        
        System.out.println(">>>" + Arrays.toString(chArr));
        for(int i = 0; i < chArr.length; i++){
        	if(!chArr[i])
        		return 0;
        }
        
        return 1;
		
	}
	
	/**
	 * MissingCheck
	 *  
	 * @param A
	 * @return
	 */
	public int MissingInteger(int A[]){
		// write your code in Java SE 8
		A = new int[]{4};  // 1개 원소일때 예외처리.. to do..
		Arrays.sort(A);
		//System.out.println(">> " + Arrays.toString(A));
		boolean isMinusVal = true;
		for(int i = 0; i < A.length-1; i++){
			if(A[i] > 0) 
				isMinusVal = false;
			if(A[i] >= 0 && A[i+1] - A[i] > 1 ){
				//System.out.println(">> " + A[i] );
				return A[i]+1;
			}
		}
		System.out.println("3333");
		if(isMinusVal)
			return 1;
		else
			return A[A.length-1]+1;

		/*
		//https://codility.com/demo/results/training33UQZ8-56G/ 
		// 100%
		A = new int[]{5,8,5,1,5,0,2,4,20};
		A = new int[]{-5,-8,-5};
		
		boolean[] counter = new boolean[A.length + 1];
        
		for(int a : A){
			if (a > 0 && a < counter.length){
				counter[a - 1] = true;
				//System.out.println(">>"+a);
			}
		}
		//System.out.println(Arrays.toString(counter));
        // Loop through the counter, if an element is false, return element index + 1 (it's a 0 index array!)
        for(int j = 0; j < counter.length; j++){
        	if(!counter[j]) 
        		return j + 1;
        }
        // You SHOULDN'T get here. But just in case, return the Array length +1. Result will most likely be 1, the lowest
        // possible integer.
        return A.length + 1;
		*/
	}
	
	public int[] MaxCounters(int N, int[] A){
		return null;
	}
}
