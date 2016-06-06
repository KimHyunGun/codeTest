
package com.kimhg.test;
import java.util.*;

public class CodilityLesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson4 cdl = new CodilityLesson4();
		
		int[] A = {1,3,1,4,2,3,5,4};
		int X = 6;
		int ret = cdl.FrogRiverOneSolution(X, A);
		System.out.println("결과 : "+ret);
		
		int[] B = {4,1,3,2};
		int ret2 = cdl.PermCheck(B);
		System.out.println("결과 : "+ret2);

		int[] C = {1,3,6,4,2,1};
		int ret3 = cdl.MissingInteger(C);
		System.out.println("결과 : "+ret3);
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
        int ret = 1;
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++){
            if(A[i] != i+1)
                return 0;
        }
        
        return ret;
	}
	
	public int MissingInteger(int A[]){
		
		A = new int[]{-988778088,-2,5,1,3,0,-4,4};
		boolean[] counter = new boolean[A.length + 1];
        
		for(int a : A){
			if (a > 0 && a < counter.length){
				counter[a - 1] = true;
				System.out.println(">>"+a);
			}
		}
		System.out.println(Arrays.toString(counter));
        // Loop through the counter, if an element is false, return element index + 1 (it's a 0 index array!)
        for(int j = 0; j < counter.length; j++){
        	if(!counter[j]) 
        		return j + 1;
        }
        // You SHOULDN'T get here. But just in case, return the Array length +1. Result will most likely be 1, the lowest
        // possible integer.
        return A.length + 1;

	}
}
