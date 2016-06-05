
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
}
