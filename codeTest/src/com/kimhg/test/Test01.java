package com.kimhg.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol1 = new Solution1();
		String S = "00-44  48 5555 8361";
		//System.out.println("Solution1 결과 : "+sol1.solution(S));
		
		S = "0 - 22 1985--324";
		System.out.println("Solution1 결과 : "+sol1.solution(S));
		//S = "555372654";
		//System.out.println("Solution1 결과 : "+sol1.solution(S));
		
		/*
		Solution2 sol2 = new Solution2();
		int N = 333;
		System.out.println("Solution2 결과 : "+sol2.solution(N));
		*/
		
		/*
		Solution3 sol3 = new Solution3();
		int[] tmpArr = {1,3,4,2,5};
		System.out.println("Solution3 결과 : "+sol3.solution(tmpArr));
		*/
		
		/*
		Solution4 sol4 = new Solution4();
		//int[] tmpArr2 = {-1,3,-4,5,1,-6,2,1};
		int[] tmpArr2 = {-7,1,5,2,-4,3,0};
		System.out.println("Solution4 결과 : "+sol4.solution(tmpArr2));
		*/
		
		/*
		Solution5 sol5 = new Solution5();
		//String A = "15:15:00";
		//String B = "15:15:12";
		String A = "22:22:21";
		String B = "22:23:23";
		
		System.out.println("Solution4 결과 : "+sol5.solution(A, B));
		*/
		
		/*
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
		
		System.out.println();
		// Math
		System.out.println( (int)Math.ceil((5 / (double)2) ) );
		
		Random ran = new Random();
		System.out.println(ran.nextInt(4));
		*/
	}

}

// 폰넘버 포맷 만들기, 공백, - 제거하고 3자리씩 끊어서 "-" 삽입
class Solution1{
	public String solution(String S){
		S = S.replaceAll("[ -]", "");
		S = "1234567890123";
		int chCnt = 0;
		int numSize = S.length();
		int numBlockSize = 3;

		System.out.println(numSize);
		StringBuffer ret = new StringBuffer();
		for(int i = 0; i < numSize; i++){
			chCnt++;
			ret.append(S.charAt(i));
			//System.out.println(">>"+i+", "+ (numSize / (3)) );
			if(numSize - (i+1) ==2 && numSize % 3 != 0){
				System.out.println(">>>>"+i);
				numBlockSize = 2;
			}
			
			if(chCnt>=numBlockSize && i < numSize - 1){
				//System.out.println(">>---------");
				
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
		//N = new int[]{7,3,4,5,1};
		//N = new int[]{1};
		//N = new int[]{1,5,2,4,6};
		//N = new int[]{1,4,6,2};
		
		
		boolean ret = true;
		int size = N.length;
		if(size<=1)
			return ret;
		
		for(int i = 1; i < size; i++){
			//System.out.println("i="+i+", "+N[i]+", i-1="+(i-1)+", "+N[i-1]);
			if(N[i] < N[i-1]){
				//System.out.println(">>>> "+i+", "+N[i]);
				if(i < size-1){
					for(int j = i+1; j < size; j++){
						if(j == i+1){
							if(N[j]<N[i-1])
								return false;
						}else{
							if(N[j]<N[j-1])
								return false;
						}
					}
				}
			}
		}	
		return ret;
		
		/*
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
		*/
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
//int[] tmpArr2 = {-7,1,5,2,-4,3,0};
class Solution4{
	public int solution(int[] N){
		int ret = -1;
		int totalSum = 0;
		for(int i = 0; i < N.length; i++){
			totalSum += N[i];
		}
		System.out.println("totalSum : "+totalSum);
		int prevSum = 0;
		int nextSum = 0;
		for(int i = 0; i < N.length; i++){
			if(i>0)
				prevSum += N[i-1];
			nextSum = totalSum - prevSum - N[i];
			
			System.out.println("i="+i+", preveSum="+prevSum+", nextSum="+nextSum);
			if(prevSum == nextSum)
				return i;
		}
		
		return ret;
	}
}

// digital clock, interesting point
/*
	15:15:00 ~ 15:15:12 사이에는 15:15:00, 15:15:01 ... 15:15:12 까지 13개의 시간이 존재함.
	각각의 시간값은 6자리의 숫자로 구성이 되는데, 이때 6개의 수 중에서 다른 수가 최대 2 이하가 되는 것이 흥미로운 점이다.
	따라서 이경우,, 15:15:11 만 해당한다.
	1, 5 이렇게 서로다른 수가 2개이므로....
	
*/
class Solution5{
	public int solution(String A, String B){
		int numA = Integer.parseInt(A.replaceAll(":", ""));
		int numB = Integer.parseInt(B.replaceAll(":", ""));
		System.out.println(numA+","+numB);
		
		int ret = 0;
		for(int i = numA; i <= numB; i++){
			String strSecond = String.valueOf(i).substring(2, 4);
			String strMinute = String.valueOf(i).substring(4);
			
			// second  > 59 or minute > 59 제외
			if( Integer.parseInt(strSecond) > 59 || Integer.parseInt(strMinute) > 59)
				continue;
			
			Set<Integer> tree = new TreeSet<Integer>();
			for(int j = 0; j < String.valueOf(i).length(); j++){
				tree.add(Integer.parseInt(String.valueOf(i).charAt(j)+""));
			}
			
			if(tree.size()<=2){
				ret++;
				//System.out.println(">>>"+i);
			}
		}
		
		return ret;
	}
}