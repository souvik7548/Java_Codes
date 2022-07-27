class OuterClass{
int a=20;
static int b=30;
class InnerClass{
int x=10;
void show(){
Outer ob=new Outer();
System.out.println("a="+a);
System.out.println("b="+OuterClass.b);
System.out.println("x="+this.x);
}
}
void display(){
	System.out.println("a="+this.a);
	System.out.println("b="+b);
}
}
public class StringDemo{
	public static void main(String...args){
		Outer o=new OuterClass();
		o.display();
		OuterClass.InnerClass ob=new OuterClass().new InnerClass();
		ob.show();
	}
}