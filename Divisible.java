package Assignments;

public class Divisible {

	public static void main(String[] args) {
		 int n=100;
		 
		 System.out.println(" Numbers  which is divisible by 2,3,and 5 is");
		 
		 for(int num=0;num<n;num++)
		 {
			 if(num % 2==0 && num % 3==0 && num % 5==0)
			 {
				 System.out.print(num + " ");
			
			 }
			 
		 }

	}

}
