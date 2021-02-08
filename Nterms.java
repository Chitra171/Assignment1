package Assignments;

import java.util.Scanner;

public class Nterms {

	public static void main(String[] args) {
		int n,i=1;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		n=scan.nextInt();
		
		while(i<=n)
		{
			System.out.print(i*i*i+" ");
			i++;
		}
	}

}
