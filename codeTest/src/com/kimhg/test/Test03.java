package com.kimhg.test;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test03 sol1 = new Test03();
		//int ret = sol1.solution(3, 7);
		
		int ret2 = sol1.solution2(-10, 5);
		System.out.println("solution2 결과 : "+ ret2);
		
		//String S = "We test coders. Give us a try?";
		String S = "Forget  CVs..Save time . x x";
		int ret3 = sol1.solution3(S);
		//System.out.println("solution3 결과 : "+ ret3);
	}
    
	
	public String solution1(String S) {
        // write your code in Java SE 8
        S = S.replaceAll("[ -]", "");
        int chCnt = 0;
        int numSize = S.length();
        int numBlockSize = 3;

        StringBuffer ret = new StringBuffer();
        for(int i = 0; i < numSize; i++){
          chCnt++;
          ret.append(S.charAt(i));

          if(numSize - (i+1) == 2 && numSize % 3 != 0){
            numBlockSize = 2;
          }
          
          if(chCnt >= numBlockSize && i < numSize - 1){
            ret.append('-');
            chCnt = 0;
          }
        }
        return ret.toString();
    }
 

	public int solution2(int A, int B){
		int ret = 0;
		
		double d = Math.sqrt(2);
		
		for(int i = A; i <= B; i++){
			double square = Math.sqrt(i);
			//System.out.println("------------------------->i : "+i+", "+(Math.sqrt(i)));
			if( (square - (int)square) == 0 ){
				System.out.println("---->i : "+i+", "+(Math.sqrt(i)));
				ret++;
			}
		}
		return ret;
	}
	
	public int solution3(String S){
		int maxWordCnt = 0;
		String[] sentence = S.split("[/./?!]");
		//System.out.println(Arrays.toString(sentence));
		
		for(String s : sentence){
			s = s.trim();
			if(s.length() == 0)
				continue;
			String[] word = s.split(" +");
			int wordCnt = word.length;
			//System.out.println("["+s+"] -> "+ wordCnt);
			if(maxWordCnt < wordCnt)
				maxWordCnt = wordCnt;
		}
		
		return maxWordCnt;
	}
	
	public int solution(int A, int B){
		int ret = 0;
		int mul = A * B;
		System.out.println(A*B);
		return ret;
	}
}

