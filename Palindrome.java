package Assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int n;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number=scan.nextInt();
		
		int originalNumber=number;
		int reminder=0;
		int reversedNumber=0;
		
		for(;number!=0;)
			
		{
			reminder=number%10;
			reversedNumber =reversedNumber*10+reminder;
			number=number/10;
			
		}
		System.out.println("Reversed Number : " + reversedNumber); 
		
		
		if(originalNumber==reversedNumber)
		{
			
			System.out.println(number + " Number is palindrome");
		}
		else
		{
			System.out.println(number + " Number is not palindrome");
				
			
		

	}

	
	}

}
