import java.util.Scanner;
import java.lang.String;
class Employee
{
	int empid;
	double salary;
	String name;
	Scanner sc=new Scanner(System.in);
	void enterRecord()
	{   
	    
	
		System.out.println("Enter a Employee ID");
		empid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name");
		name=sc.nextLine();
		System.out.println("Enter salary");
		salary=sc.nextDouble();
		
	}
	void display()
	{
		         System.out.println(empid+"\t"+name+"\t"+salary);             
	}
	void display_by_empid(Employee[] empArray,int empid,int c)
	{
		                         int flag=0;
								  if(empArray[0]==null)
									 {System.out.println("Sorry. Record not found");}
								 for(int j=0;j<c;j++)
								 {    
									 if(empArray[j].empid==empid)
									 {   flag=1;
										 empArray[j].display();
										 
										 break;
									 }
									 
								 }
								 if(flag==0 || empArray[0]==null)
									 {System.out.println("Sorry. Record not found");}
	}
	
	void display_by_name(Employee[] empArray,String s1,int c)
	{
                                int flag=0;
								for(int j=0;j<c;j++)
								{
									if((empArray[j].name.compareTo(s1))==0)
									{   flag=1;
										empArray[j].display();
									}
									if(flag==0)
									{{System.out.println("Sorry. Record not found");}}
								}
								if(flag==0 || empArray[0]==null)
									 {System.out.println("Sorry. Record not found");}
	}
	
	
	void displaySorted(Employee[] empArray,int c)
	{
		for(int p=0;p<c;p++)
						          {
							      for(int t=p+1;t<c;t++)
							      {
								     if((empArray[p].name.compareTo(empArray[t].name))>0)
								     {
									  Employee temp=empArray[p];
									  empArray[p]=empArray[t];
									  empArray[t]=temp;
								     }
							       }
						           } 
								
								for(int j=0;j<c;j++)
								{
									System.out.println(empArray[j].empid+"\t"+empArray[j].name+"\t"+empArray[j].salary);
								}
	}
	
	void find_for_update(Employee[] empArray,int eid,int c)
	{
		             int flag=0;
					 for(int j=0;j<c;j++)
					 {
						 if(empArray[j].empid==eid)
						 { 
					       flag=1;
					       empArray[j].update();
					       break;
						 }
						 
					 }
					 if(flag==0)
					 {
						 System.out.println("Sorry no such record found");
					 }
	}
	void update()
	{
		
		System.out.println("\t\t\t\t\tCAUTION: EMPLOYEE ID can't be updated");
		System.out.println("Enter new name(Enter old name in case you don't want to change)");
		name=sc.next();
		System.out.println("Enter new salary(Enter old salary in case you don't want to change)");
		salary=sc.nextFloat();
		
	}
}

class BlankScreen
{
	public static void clearScreen()
	{
		try
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e)
		{}
	}
}
class Main
{
	public static void main(String[] args)
	{   BlankScreen.clearScreen();
		Scanner sc=new Scanner(System.in);
		Employee empArray[]=new Employee[100];
		int i=0;
		
		while(true)
		{   
	        
		System.out.println("\t\t\tWelcome to ICT Academy IIT Kanpur Student Management System");
		System.out.println("\t\t\tChoose from the services we provide");
		System.out.println("\t\t\t1-->Enter a record");
		System.out.println("\t\t\t2-->Display records");
		System.out.println("\t\t\t\t\t1-->Display employee details sorted on basis of name");
		System.out.println("\t\t\t\t\t2-->Display record matching an employee ID");
		System.out.println("\t\t\t\t\t3-->Display record matching an employee name");
		System.out.println("\t\t\t3-->Update a record");
		System.out.println("\t\t\t4-->Exit");
		
	        System.out.println("Enter a choice");
			int n=sc.nextInt();
		switch(n)
		{
			
			case 1: BlankScreen.clearScreen();
			        empArray[i]=new Employee();
				    
				   empArray[i].enterRecord();
				   BlankScreen.clearScreen();
				   i++;
			        break;
			case 2: System.out.println("You have chosen for display option. Now please enter further input to select a display approach");
			        int k=sc.nextInt();
					switch(k)
					{
						case 1: BlankScreen.clearScreen();
						        empArray[--i].displaySorted(empArray,++i);
						         
								break;
						case 2: BlankScreen.clearScreen();
						        System.out.println("Enter an employee id to fetch a record");
						         int eid=sc.nextInt();
								 if(empArray[0]==null)
								 {
									 System.out.println("Sorry. Presently no records in database. Enter some data");
								 }
								 else
								 {
								 empArray[0].display_by_empid(empArray,eid,i++);
								 }
								 break;
						case 3:BlankScreen.clearScreen();
						       System.out.println("Enter a name to fetch related records");
						        String s1=sc.next();
								
								if(empArray[0]==null)
								 {
									 System.out.println("Sorry. Presently no records in database. Enter some data");
								 }
								 else
								 {
								 empArray[0].display_by_name(empArray,s1,i++);
								 }
								
						        
								
					}
					break;
			case 3:  BlankScreen.clearScreen();
			         System.out.println("Enter an Employee ID which do you want to update");
			         int eid=sc.nextInt();
					 if(empArray[0]==null)
								 {
									 System.out.println("Sorry. Presently no records in database. Enter some data");
								 }
								 else
								 {
								 empArray[0].find_for_update(empArray,eid,i++);
								 }
					 break;
					 
			case 4:System.exit(0);
				
		}
		}
		
	}
}