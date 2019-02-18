package com.comcast.ifElse;

import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Given an integer, , perform the following conditional actions:

			Block 1. If  is odd, print Weird
			Block 2. If  is even and in the inclusive range of 2 to 5, print Not Weird
			Block 3. If  is even and in the inclusive range of 6 to 20, print Weird
			Block 4. If  is even and greater than , print Not Weird
			Complete the stub code provided in your editor to print whether or not  is weird.*/
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		
		int[] set1 = {2,3,4,5};
		int[] set2 = {6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		//System.out.println(set2.length);
		//System.out.println(set1.length);
		
		if (a % 2 != 0) {
			System.out.println("Weired");
		}
		
		//this could be much more simplified without For loop (a % 2 == 0 && a<=5) is sufficient 
		else if(a % 2 == 0 && a<=5) {
		for (int i=0; i<set1.length ;  ++i) {
			int aa = set1[i];
					if (aa == a && a % 2 == 0) {
						System.out.println("If  is even and in the inclusive range of 2 to 5, print Not Weird");
					}
		}
		}
		else if(a % 2 == 0 && (a>=6 && a<=20)) {
			 System.out.println("Not Weird");
			
			}
		else if(a % 2 == 0 && (a>=21)) {
			 System.out.println("the Last block --- Not Weird");
			
			}
			}
		
	}


