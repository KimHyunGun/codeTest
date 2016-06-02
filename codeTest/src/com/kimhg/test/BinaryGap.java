package com.kimhg.test;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tmpNum = 9;
		String binString = Integer.toBinaryString(tmpNum);
		binString = "11111001000000100100011";
		
		int ret = 0;
		for(int i = 0; i<binString.length(); i++){
			if(binString.charAt(i) == '1'){
				int zeroCnt = 0;
				
				for(int j = i+1; j<binString.length(); j++){
					if(binString.charAt(j) == '0'){
						zeroCnt++;
					}else{
						if(ret<zeroCnt)
							ret = zeroCnt;
						break;
					}
				}
				
			}
		}
		
		System.out.println("결과 : "+ret);
	}

}
