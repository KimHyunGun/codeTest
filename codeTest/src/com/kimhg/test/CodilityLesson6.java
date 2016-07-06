
package com.kimhg.test;
import java.util.*;

public class CodilityLesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson6 cdl = new CodilityLesson6();
		
		// Triangle
		int[] A = {2147483647, 2147483646, 2147483645};
		//int[] A = {10, 50, 5, 1};
		int ret1 = cdl.TriangleSolution(A);
		System.out.println("결과 : "+ret1);
		
		// Distinct
		int[] B = {2, 1, 1, 2, 3, 1};
		int ret2 = cdl.DistinctSolution(B);
		System.out.println("결과 : "+ret2);
		
		// MaxProductOfThree
		int[] C = {-3, 1, 2, -2, 5, 6};
		int ret3 = cdl.MaxProductOfThreeSolution(C);
		System.out.println("결과 : "+ret3);
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
		//System.out.println(Arrays.toString(A));
		for(int i = 0; i < A.length; i++){
			for(int j = i+1; j < A.length-1; j++){
				System.out.println(A[i]+", "+A[j]+", "+A[j+1]+", "+(A[i]+A[j]));
				// int 2,XXX,XXX,XXX overflow 해결
				// int를 long type로 케시팅..
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
	
	/**
	 * 
	 * @MethodName : DistinctSolution
	 * @Date : 2016. 7. 6. 
	 * @author : kim, hyungun
	 * @description : 
	 * @변경이력 :
	 * 	https://codility.com/demo/results/trainingE6F9MZ-UCF/
	 *  ==> Correctness 100%, Performance 100%
	 * @param A
	 * @return
	 */
	public int DistinctSolution(int[] A){
		int ret = 0;
        boolean[] chArr = new boolean[1000000*2+1];
        
        for(int i = 0; i < A.length; i++){
            int idx = A[i] >= 0 ? A[i] : A[i]*(-1)+1000000;
            if(chArr[idx]){
                continue;
            }else{    
                chArr[idx] = true;
                ret++;
            }
        }
        
        return ret;
	}

	/**
	 * 
	 * @MethodName : MaxProductOfThreeSolution
	 * @Date : 2016. 7. 6. 
	 * @author : kim, hyungun
	 * @description : 
	 *  https://codility.com/demo/results/trainingXMCTMV-4NR/
	 *   ==> Correctness 100%, Performance 0%
	 *  https://codility.com/demo/results/trainingAN59FW-25K/
	 *   ==> Correctness 100%, Performance 100%
	 * @변경이력 :
	 * @param A
	 * @return
	 */
	public int MaxProductOfThreeSolution(int[] A){
		Integer maxRet = null;
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		for(int i = 0; i < A.length-2; i++){
			int mulNum = 0;
			if(A[i] == 0){
				mulNum = 0;
			}else if(A[i] < 0){
				mulNum = A[i] * A[i+1] * A[A.length-1];
			}else{
				mulNum = A[A.length-3] * A[A.length-2] * A[A.length-1];
			}
			if(maxRet == null || mulNum > maxRet)
				maxRet = mulNum;
		}
		return maxRet;

	}
}
