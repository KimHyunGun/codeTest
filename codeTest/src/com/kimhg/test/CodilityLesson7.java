
package com.kimhg.test;
import java.util.*;

public class CodilityLesson7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson7 cdl = new CodilityLesson7();
		
		// Fish
		int[] A = {4,3,2,1,5};
		int[] B = {0,1,0,0,0};
		int ret1 = cdl.FishSolution(A, B);
		System.out.println("결과 : "+ret1);
	}

	//////////////////////////////////////
	// FishSolution
	//////////////////////////////////////
	/**
	*/
	public int FishSolution(int[] A, int[] B){
		int ret = 0;
		int killFish[] = new int[A.length];
		int aliveFish[] = new int[A.length];
		
		int downStreamFishIdx = -1;
		int aliveCnt = 0;
		for(int i = 0; i < A.length-1; i++){
			if(B[i] == 1 && B[i+1] == 0 ){
				System.out.println("==>"+i+", "+A[i]);
			}
			/*
			if(B[aliveIdx] != B[i]){
				if(A[aliveIdx] < A[i]){
					System.out.println("1==>"+i+", "+aliveIdx);
					killFish[aliveIdx] = 1;
					aliveIdx = i;
				}else{
					System.out.println("2==>"+i+", "+aliveIdx);
					killFish[i] = 1;
				}
			}
			*/
		}
		
		System.out.println(">> "+Arrays.toString(aliveFish));
		return aliveCnt;
	}
	

}
