package com.kimhg.test02;

import java.io.*;

interface father{}
interface mother{}
interface programmer{
	public void coding();
}

interface believer{}

class Steve implements father, programmer, believer{
	public void coding(){
		System.out.println("fast");
	}
}

class Rachel implements mother, programmer{
	public void coding(){
		System.out.println("elegance");
	}
}

public class PolymorphismTest2{
	public static void main(String[] args){
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();
		 
		employee1.coding();
		employee2.coding();
		
		PolymorphismTest2 p1 = new PolymorphismTest2();
		p1.fileTest();
	}
    
    public void fileTest(){
    	BufferedReader br = null;
    	String input = null;
    	try {
    		br = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    	try {
    		while(true){
    			input = br.readLine();
    			if(input == null)
    				break;
    	        System.out.println(input); 
    		}
       		br.close();
 		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    }
}