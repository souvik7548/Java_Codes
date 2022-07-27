import java.util.Scanner;
class Number{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number in integer form");		
	      int n=sc.nextInt();
		  if(n>0){
			  if(n%2==0){
				  System.out.println("number is even");
			  }
			  else{
				  System.out.println("nu,ber is odd");
			  }
		  }
		  else{
			  System.out.println("number is not a natural number");
		  }
	}
}

			 