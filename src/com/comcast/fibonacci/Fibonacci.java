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
		
		System.out.println();
		
		int t1 = 1;
		int t2 = 2;
		int loopNum =0;
		
		while(loopNum <10) {
			
			int sum = t1 + t2;
						System.out.print( sum + "::");
			t1 = t2;
			t2 = sum;
			loopNum = loopNum + 1;
			
		} 
	}

}

