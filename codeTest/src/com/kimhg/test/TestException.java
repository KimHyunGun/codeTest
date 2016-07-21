package com.kimhg.test;

public class TestException {

    public void sayNick(String nick) throws FoolException {
    	/**
    	 * RuntimeException
    	 *  - 실행시 오류
    	 */
    	/*
        if("fool".equals(nick)) {
        	throw new FoolRuntimeException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
        */

    	/**
    	 * Exception
    	 *  - 컴파일시 오류
    	 *  - try/catch
    	 */
    	/*
        if("fool".equals(nick)) {
        	try {
				throw new FoolException();
			} catch (FoolException e) {
				// TODO Auto-generated catch block
				System.err.println("FoolException이 발생했습니다.");
				e.printStackTrace();
			}
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
		*/
    	
    	/**
    	 * Exception
    	 *  - 컴파일시 오류
    	 *  - throws Exception
    	 */
        if("fool".equals(nick)) {
			throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");

    }

    public static void main(String[] args) {
    	
    	TestException test = new TestException();
        try {
			test.sayNick("fool");
	        test.sayNick("genious");
		} catch (FoolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    	//System.out.println(333);
    }

}

