package com.comcast.problems;

import java.util.Scanner;;
public class RealasticProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int xPeanuts = 500;
		int xFries = 200;
		int canEat = xPeanuts +  xFries;
		System.out.println("I can Eat up to " + canEat);
		

		Scanner canIeat = new Scanner(System.in);
		System.out.println("Enter no of Fries and Penauts you can Eat");
		
		int xFries1 = canIeat.nextInt();
		int xPeanuts1 = canIeat.nextInt();
		
		int xHowmuchIeat = xFries1 + xPeanuts1;
		
		System.out.println("I Eat " + xHowmuchIeat + " Fies and Peanuts ! Here you GO!");
		
	}

}
