package com.kimhg.test;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TapeEquilibrium te = new TapeEquilibrium();
		
		int[] arr = {3, 1, 2, 4, 3};
		int ret = te.solution(arr);
		System.out.println("결과 : "+ret);
	}

    public int solution(int[] A) {
		// write your code in Java SE 8
		int ret = 0;
		
		int totalSum = 0;
		for(int i = 0; i < A.length; i++){
			totalSum += A[i];
		}
		int firstSum = 0;
		
		int secondSum = 0;
		for(int j = 1; j < A.length; j++){
			firstSum += A[j-1];
			secondSum = totalSum - firstSum; 
			    
			System.out.println(j+", |"+firstSum+" - "+secondSum+"|"+ Math.abs(firstSum-secondSum)+", "+totalSum);
			int diffSum = Math.abs(firstSum-secondSum);
			if(j == 1 || ret >= diffSum){
				ret = diffSum;
		    }
		}
		
		return ret;
		        
	}
       
}
