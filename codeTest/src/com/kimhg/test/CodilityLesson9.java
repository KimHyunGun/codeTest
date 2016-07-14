
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
	 *  https://rafal.io/posts/codility-max-double-slice-sum.html
	 * @변경이력 :
	 * @param A
	 * @return
	 */
	public int MaxDoubleSliceSumSolution(int[] A){
		//A = new int[]{3,2,6,-1,4,5,-1,2};
		A = new int[]{3,2,6,1,4,5,1,2};
		
		System.out.println(Arrays.toString(A));
		int maxSum = 0;
		int[] tmpArr = new int[A.length-2];
		System.arraycopy(A, 1, tmpArr, 0, A.length-2);
		Arrays.sort(tmpArr);
		int negativeNumCnt = 0;
		int positiveNumCnt = 0;
		for(int i = 0; i < tmpArr.length; i++){
			System.out.println(">> " + tmpArr[i]);
			if(tmpArr[i]>0){
				maxSum += tmpArr[i];
				positiveNumCnt++;
			}else{
				negativeNumCnt++;
			}
		}
		
		if(positiveNumCnt == tmpArr.length)
			maxSum -= tmpArr[0];
		
		return maxSum;
		
		/*
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
		*/
	}
	

}
