
package com.kimhg.test;
import java.util.*;

public class CodilityLesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson6 cdl = new CodilityLesson6();
		
		// Triangle
		int[] A = {2147483647, 2147483646, 2147483645};
		//int[] A = {10, 50, 5, 1};
		int ret2 = cdl.TriangleSolution(A);
		System.out.println("결과 : "+ret2);
	}

	//////////////////////////////////////
	// Triangle
	// https://codility.com/demo/results/trainingX77K6P-FVD/
	// Correctness 90%, Performance 50%
	// https://codility.com/demo/results/trainingTMJG3R-6ZC/
	// Correctness 90% (overflow error, Max int..) , Performance 100%
	// https://codility.com/demo/results/trainingSRE4T2-7WB/
	// Correctness 100%, Performance 100%
	//////////////////////////////////////
	/**
	*/
	public int TriangleSolution(int[] A){
		int ret = 0;
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		for(int i = 0; i < A.length; i++){
			for(int j = i+1; j < A.length-1; j++){
				System.out.println(A[i]+", "+A[j]+", "+A[j+1]+", "+(A[i]+A[j]));
				// int 2,XXX,XXX,XXX overflow 해결
				long firstNum = (long)A[i];
				long secondNum = (long)A[j];
				long thirdNum = (long)A[j+1];
				
				if(firstNum + secondNum > thirdNum){
					return 1;
				}else{
					break;
				}
			}
			System.out.println("-----------------");
		}
		return ret;
	}
	
}
