package com.kimhg.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol1 = new Solution1();
		String S = "00-44  48 5555 8361";
		S = "0 - 22 1985--324";
		S = "555372654";
		System.out.println("Solution1 결과 : "+sol1.solution(S));

		Solution2 sol2 = new Solution2();
		int N = 333;
		System.out.println("Solution2 결과 : "+sol2.solution(N));
		
		Solution3 sol3 = new Solution3();
		int[] tmpArr = {1,3,4,2,5};
		System.out.println("Solution3 결과 : "+sol3.solution(tmpArr));

		Solution4 sol4 = new Solution4();
		int[] tmpArr2 = {-1,3,-4,5,1,-6,2,1};
		System.out.println("Solution4 결과 : "+sol4.solution(tmpArr2));
	
		
		// String[] to List testing
		List<String> sList = new ArrayList<String>();
		sList.add("a");
		sList.add("b");
		sList.add("c");
		for(String s : sList)
			System.out.print(s);
		
		// List -> String[];
		String[] sArr = new String[sList.size()];
		sArr = sList.toArray(sArr);
		System.out.println(Arrays.toString(sArr));

		// String[] -> List
		//List<String> sList2 = new ArrayList<String>(Arrays.asList(sArr));
		List<String> sList2 = Arrays.asList(sArr);
		for(String s : sList2)
			System.out.print(s);
		
		
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
		//N = new int[]{2,3,4,1,5};
		N = new int[]{7,3,4,5,1};
		//N = new int[]{-2,1};
		
		boolean ret = false;
		int size = N.length;
		
		// 각 index의 값을 하나씩 제외한 배열을 생성해서 정렬 여부 판단.
		for(int i = 0; i < size; i++){
			int[] tmpArr = new int[size-1];
			if(i == 0){
				System.arraycopy(N, 1, tmpArr, 0, size-1);
			}else if(i>0 && i < size-1){
				System.arraycopy(N, 0, tmpArr, 0, i);
				System.arraycopy(N, i+1, tmpArr, i, size-i-1);
			}else{
				System.arraycopy(N, 0, tmpArr, 0, size-1);
			}

			//System.out.println(i+", "+Arrays.toString(tmpArr));
			
			if(isSort(tmpArr))
				return true;
			
		}
		return ret;
	}
	
	public boolean isSort(int[] N){
		boolean ret = true;
		if(N.length <= 1)
			return ret;
		
		for(int i = 0; i < N.length-1; i++){
			if(N[i]>N[i+1]){
				return false;
			}
		}
		return ret;
	}
}

//https://codility.com/public-report-detail/
//Equi
//Find an index in an array such that its prefix sum equals its suffix sum.
class Solution4{
	public int solution(int[] N){
		int ret = -1;
		int totalSum = 0;
		for(int i = 0; i < N.length; i++){
			totalSum += N[i];
		}
		
		int prevSum = 0;
		int nextSum = 0;
		for(int i = 0; i < N.length; i++){
			if(i>0)
				prevSum += N[i-1];
			nextSum = totalSum - prevSum - N[i];
			
			//System.out.println("i="+i+", preveSum="+prevSum+", nextSum="+nextSum);
			if(prevSum == nextSum)
				return i;
		}
		
		return ret;
	}
}