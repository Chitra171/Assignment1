package Assignments;

import java.util.Scanner;

public class PrimeBtwn {

	public static void main(String[] args) {
		 int i,count;
		 System.out.println("Enter n value:");
		 
		 Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		 System.out.println("prime numbers between 10 to " + n + " are");
		 
		 for(int j=11;j<=n;j++)
		 {
			 count=0;
			 for(i=1;i<=j;i++)
			 {
				 if(j%i==0)
				 {
					 count++;
				 }
			 }
			 
			 if(count==2)
				 
				 System.out.print(j + " ");
		 }
		 
		 
		

	}

}
