
package com.kimhg.test;
import java.util.*;

public class CodilityLesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson5 cdl = new CodilityLesson5();
		//CodilityLesson4.java
		int[] A = {0,1,0,1,1};
		//int[] A = {1,1,0};
		int ret = cdl.PassingCarsSolution(A);
		System.out.println("결과 : "+ret);
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
	
}
