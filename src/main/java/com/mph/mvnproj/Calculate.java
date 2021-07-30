package com.mph.mvnproj;

public class Calculate {
	public int add(int ... number) 
	{
		int result = 0;
		for(int i:number) {
			result =result + i;
		}
		return result;
	}
	
	public int multiply(int ... number) {
		int result = 1;
		for (int i : number) {
			result *= i;
		}
		return result;
	}
	public int divide() throws ArithmeticException{
		int result = (5/0);
		return result;
	}

	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(10,50,60));
		System.out.println(c.add(80,160));
		System.out.println(c.add(105,150,60,80));
		System.out.println(c.multiply(105,150,60,80));
		System.out.println(c.multiply(15,80));
		System.out.println(c.multiply(105,150,600));
		
	}

}
