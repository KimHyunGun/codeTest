package com.kimhg.test;

import java.util.Random;

public class PositionJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionJump pj = new PositionJump();
		
		int ret = pj.solution(3, 100, 7);
		System.out.println("결과 : "+ret);
	}

	public int solution(int X, int Y, int D){
		int ret = 0;

		/*
	    //not a valid distance to jump
		int distance = Y - X;
	    if(distance <= 0){
	        ret = 0;
	    }else if(distance % D > 0){
	        ret = (distance / D)+1;
	    }else{
	        ret = distance/D;
	    }
		*/
		ret = (int) Math.ceil( (Y-X) / (double)D );
	    
		return ret;
	}
}
