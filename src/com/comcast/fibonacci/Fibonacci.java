package com.comcast.fibonacci;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		
		int firstNum = 1;
		int secondNum =2;
		
		for (int i =0; i < 10 ; i++) {
			
			int fibNum = firstNum + secondNum;
			System.out.print(fibNum + " - ");
			firstNum = secondNum;
			secondNum = fibNum;
			
			/*1 + 2 = 3
			2 + 3 = 5
			5 + 3 = 8*/
		}
	}

}

