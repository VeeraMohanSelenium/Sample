package com.Google;
class OverloadDemo{
	void test() {
		System.out.println("No Parameter");
	}
	void test(int a) {
		System.out.println("a :" + a);
	}
	void test(int a , int b) {
		System.out.println("a & b is :" + a + " " + b);
	}
	double test(double a) {
		System.out.println(a);
		return a;
	}
}
public class Overload {
	public static void main(String[] args) {
		OverloadDemo od = new OverloadDemo();
		double result;
		od.test();
		od.test(2);
		od.test(10, 12);
		result = od.test(11.50);
		System.out.println("result of double return type" + result);
		
	}

}
