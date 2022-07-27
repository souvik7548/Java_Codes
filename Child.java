class GrandParent{
GrandParent(){
System.out.println("default constructor from GrandParent");
}
}
class Parent extends GrandParent{
parent(){
System.out.println("default constructor from parent");
}
 parent(int a){
	System.out.println("parameter constructor from parent");
}
private void display(){
	System.out.println("display from parent");
}
}
class Child extends Parent{
	Child(int a){
		super(12);
		System.out.println("paraa display from parent");
	}
	public static void main(String...args){
		Child c= new Child(56);
		c.parent();
		c.GrandParent();
	}
}
		