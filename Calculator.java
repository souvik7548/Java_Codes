class Parent{
	void display(){
		System.out.println("display from parent class");
	}
}
class Child extends Parent{
	void show(){
		System.out.println("show from child");
	}
public static void main(String[]args){
	
child c=new Child();
c.display();
c.show();
}
}