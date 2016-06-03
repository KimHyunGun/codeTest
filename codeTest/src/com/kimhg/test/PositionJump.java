package com.kimhg.test;

import java.util.Random;

public class PositionJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionJump pj = new PositionJump();
		
		Random ran = new Random();
		int X = ran.nextInt(10000)+1;
		int Y = ran.nextInt(1000000)+1;
		int D = ran.nextInt(1000000)+1;
		D = 2;
		for(;Y<X;){
			Y = ran.nextInt(1000000)+1;
		}
		//System.out.println(X+", "+Y+", "+D);
		int ret = pj.solution(1, 1000000000, 2);
		//int ret = 0;
		System.out.println("결과 : "+ret);
	}

	public int solution(int X, int Y, int D){
		/*
		X = 5;
		Y = 18579721;
		D = 2;
		*/
		int ret = 0;
		int distance = Y - X;

	    //not a valid distance to jump
	    if(distance <= 0){
	        ret = 0;
	    }else if(distance % D > 0){
	        ret = (distance / D)+1;
	    }else{
	        ret = distance/D;
	    }
		
		
	    ret = (int) Math.ceil( (Y-X) / (double)D );
	    
		return ret;
	}
}
