package Assignments;

import java.util.Scanner;

public class AddValue {

	public static void main(String[] args) {
		int First,Last;
		 System.out.println("Enter First and Last value:");
		 
		 Scanner scan=new Scanner(System.in);
		 First=scan.nextInt();
		 
		 Last=scan.nextInt();
		  int i=0,sum=0;
		  
		  System.out.println("sum of value is");
		  
		  for(i=First;i<=Last;i++)
		  {
			  sum=sum+i;
			 
		  }
System.out.print(sum );

	}

}
