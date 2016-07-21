package com.kimhg.test02;

class A{
	public String x(){ return "A.x"; }
}
class B extends A{
	public String x(){ return "B.x"; }
	public String y(){ return "B.y"; }
}
class B2 extends A{
	public String x(){ return "B2.x"; }
}

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		A obj2 = new B2();
		System.out.println("obj.x() >> "+obj.x());
		System.out.println("obj2.x() >> " + obj2.x());
		
	}

}
