import java.util.Scanner;

public class Student {
static Scanner sc =new Scanner(System.in);
String name;
String email;
String address;
int id;
int password;
int number;
int dob;

static void studentRecord() {
System.out.println("enter your name in string");
String name=sc.nextLine();

System.out.println("enter your email address in string");
String email=sc.nextLine();


System.out.println("enter your address in string");
String address=sc.nextLine();

System.out.println("enter your id in integer");
int id=sc.nextInt();

System.out.println("enter your password in integer");
int password =sc.nextInt();

System.out.println("enter your number in integer");
int number=sc.nextInt();


System.out.println("enter your date of birth like DD//MM//YY --> format");
int dob=sc.nextInt();
}
 public class  Administration {
	String name;
	String email;
	String address;
	String position;
	String salary;
	String branch;
	String qualification;
	int id;
	int password;
	int number;
	int dob;
	
}
 void teacherRecord() {
	System.out.println("enter your name in string");
	String name=sc.nextLine();

	System.out.println("enter your email address in string");
	String email=sc.nextLine();


	System.out.println("enter your address in string");
	String address=sc.nextLine();
	
	System.out.println("enter your position in this institution");
	String position =sc.nextLine();
	
	System.out.println("enter your salary amount");
	String slary=sc.nextLine();
	
	System.out.println("enter your branch");
	String branch=sc.nextLine();
	
	System.out.println("enter your qualification");
	String qualification=sc.nextLine();
	
	System.out.println("enter your id in integer");
	int id=sc.nextInt();

	System.out.println("enter your password in integer");
	int password =sc.nextInt();

	System.out.println("enter your number in integer");
	int number=sc.nextInt();


	System.out.println("enter your date of birth like DD//MM//YY --> format");
	int dob=sc.nextInt();
}
public static void main(String...args) {
	Student ob=new Student();
	
	
	do {
		
		System.out.println("*****welcome to the Hcst student dashboard*****");
		System.out.println("press 1 for student registration");
		System.out.println("press 2 for administration log in");
		System.out.println("press 3 for exit from hcst portal");
		System.out.println("please enter choices");
		int option=sc.nextInt();
		switch(option) {
		
		case 1:
		Student.studentRecord();
		System.out.println("****THANKS SHARADAN VISIT AGAIN****");
		break;	
		case 2:
			ob.teacherRecord();
			System.out.println("THANKS HONOURABLE FACULTY MEMEBER OF SHARDA GROUP OF INSTITUTION\n PLEASE VISIT AGAIN");
		break;
		
		case 3:
			System.exit(0);
		break;
		
		default:
			System.out.println("BYE BYE YOU HAVENOT CHOOSING A CORRECT OPTION\n PLEASE TRY AGAIAN");
		
		}		
	}while(true);
}
}
