import java.util.Scanner;
public class StringDemo{
	static void dev(){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		
		try{
			System.out.println("result="+(a/b));
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
	
		sc.close();
	}
		public static void main(String...args){
			dev();
		}
	
}