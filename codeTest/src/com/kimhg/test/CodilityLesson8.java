
package com.kimhg.test;
import java.util.*;

public class CodilityLesson8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodilityLesson8 cdl = new CodilityLesson8();
		
		// EquiLeader
		//int[] A = {4,3,2,1,5};
		int[] A = {4,3,4,4,4,2};
		
		int ret1 = cdl.EquiLeaderSolution(A);
		System.out.println("EquiLeader 결과 : "+ret1);
	}

	//////////////////////////////////////
	// EquiLeader
	//////////////////////////////////////
	/**
	*/
	public int EquiLeaderSolution(int[] A){
		System.out.println( (int) Math.round( (3 / (double)2 ) ) );
		int ret = 0;
		int size = A.length;
		if(size <= 1)
			return 0;
		
		return ret;
	}
	

}
