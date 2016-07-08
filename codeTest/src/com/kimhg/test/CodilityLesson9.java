
package com.kimhg.test;
import java.util.*;

public class CodilityLesson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson9 cdl = new CodilityLesson9();
		
		// MaxDoubleSliceSum
		//int[] A = {1,2,3,4,5};
		int[] A = {3,2,6,-1,4,5,-1,2};
		
		int ret1 = cdl.MaxDoubleSliceSumSolution(A);
		System.out.println("MaxDoubleSliceSum 결과 : "+ret1);
	}

	/**
	 * 
	 * @MethodName : MaxDoubleSliceSumSolution
	 * @Date : 2016. 7. 8. 
	 * @author : kim, hyungun
	 * @description :
	 *  https://codility.com/demo/results/trainingVGNEZN-JTG/
	 *   - Correctness 100%, Performance 28% , score 61%, timeout...
	 * @변경이력 :
	 * @param A
	 * @return
	 */
	public int MaxDoubleSliceSumSolution(int[] A){
		System.out.println(Arrays.toString(A));
		int size = A.length;
		int oneSum = 0;
		int twoSum = 0;
		int maxSum = 0;
		for(int i = 0; i < size; i++){
			oneSum = 0;
			for(int j = i+1; j < size; j++){
				if(j - i > 1)
					oneSum += A[j-1];
				twoSum = 0;
				for(int k = j+1; k < size; k++){
					if(k - j > 1)
						twoSum += A[k-1];
					
					if(maxSum < oneSum + twoSum)
						maxSum = oneSum + twoSum;
					//System.out.println("k =============== "+k+", "+j+", "+i);
				}
				//System.out.println("i : "+i+", j : "+j+", oneSum :"+oneSum);
			}
			//System.out.println("i =============== "+i);
		}
		return maxSum;
	}
	

}
