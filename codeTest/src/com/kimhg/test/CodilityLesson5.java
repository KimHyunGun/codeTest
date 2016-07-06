
package com.kimhg.test;
import java.util.*;

public class CodilityLesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson5 cdl = new CodilityLesson5();
		/*
		//CodilityLesson4.java
		int[] A = {0,1,0,1,1};
		//int[] A = {1,1,0};
		int ret = cdl.PassingCarsSolution(A);
		System.out.println("결과 : "+ret);
		*/
		
		
		// countDiv
		int a = 0;
		int b = 5;
		int k = 1;
		int ret2 = cdl.countDivSolution(a, b, k);
		System.out.println("결과 : "+ret2);
	}

	//////////////////////////////////////
	//PassingCars
	// https://codility.com/demo/results/training7P4M64-G4S/
	//////////////////////////////////////
	/**
	*/
	public int PassingCarsSolution(int[] A){
	   int zCount = 0;  // how many going east 
	   int passing = 0; // total passing pairs
	   
	   for(int i : A){
	       if(i == 1){
	           passing += zCount;
	       }
	       else zCount++;
	       
	   }
	   if(passing > 1e9 || passing < 0) return -1;
	   else return passing;
	}
	
	/**
	 * 
	 * @MethodName : countDivSolution
	 * @Date : 2016. 6. 24. 
	 * @author : kim, hyungun
	 * @description : 
	 * 	that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
	 *  { i : A ≤ i ≤ B, i mod K = 0 }
	 *  For example, for A = 6, B = 11 and K = 2, your function should return 3, 
	 *  because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10. 
	 *  
	 *  ==> https://codility.com/demo/results/training2QT9BW-Z3A/
	 *  ==> https://codility.com/demo/results/trainingJ6YPXB-PQX/ // me RESPECTABLE

	 *  
	 *  ==> For example, for the input [0, 0, 11] the solution returned a wrong answer (got 0 expected 1).
	 * @변경이력 :
	 * @param A
	 * @param B
	 * @param K
	 * @return
	 */
	public int countDivSolution(int A, int B, int K){

       int result = 0;
		if (B == 0) {
			result = 1;
		} else if (A == B) {
			result = B % K == 0 ? 1 : 0;
		} else {
			result = (B / K) - (A / K);
			if(A % K == 0)
			    result++;
		}
		  
		return result;
		
	}
}
