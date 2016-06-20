package com.kimhg.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol1 = new Solution1();
		String S = "00-44  48 5555 8361";
		S = "0 - 22 1985--324";
		S = "555372654";
		System.out.println("결과 : "+sol1.solution(S));

		Solution2 sol2 = new Solution2();
		int N = 333;
		System.out.println("결과 : "+sol2.solution(N));
		
		Solution3 sol3 = new Solution3();
		int[] tmpArr = {1,3,4,2,5};
		System.out.println("결과 : "+sol3.solution(tmpArr));
	}

}

// 폰넘버 포맷 만들기, 공백, - 제거하고 3자리씩 끊어서 "-" 삽입
class Solution1{
	public String solution(String S){
		S = S.replaceAll("[ -]", "");
		int chCnt = 0;
		StringBuffer ret = new StringBuffer();
		for(int i = 0; i < S.length(); i++){
			chCnt++;
			ret.append(S.charAt(i));
			if(chCnt==3 && i < S.length() - 1){
				ret.append('-');
				chCnt = 0;
			}
		}
		return ret.toString();
	}
}

// 각 자리수를 재배열해서 생성할 수 있는 숫자 중 가장 큰 수를 반환
class Solution2{
	public int solution(int N){
		String strN = new Integer(N).toString();
		//System.out.println(strN);
		Integer[] digitCharArr = new Integer[strN.length()];
		for(int i = 0; i < strN.length(); i++){
			//System.out.println(">>" + strN.charAt(i));
				
			digitCharArr[i] = Integer.parseInt(""+strN.charAt(i));
		}
		Arrays.sort(digitCharArr, Collections.reverseOrder());
		//System.out.println(Arrays.toString(digitCharArr));

		String ret = "";
		for(int i = 0; i < digitCharArr.length; i++){
			ret += digitCharArr[i];
		}
		return Integer.parseInt(ret);
	}
}

// int 배열에서 단 한번만 이동으로 정렬이 가능한지 true, false 반환
class Solution3{
	public boolean solution(int[] N){
		for(int i = 0; i < N.length; i++){
			System.out.println(i+">> "+N[i]);
		}
		return false;
	}
}