class Parent{
int a=20;
}
class Utpal extends Parent{
	int a=330;
	void show(){
		int a=5;
		System.out.println("a="+a);
		System.out.println("a="+super.a);
		System.out.println("a="+this.a);
	}
	public static void main(String...args){
		Utpal ob=new Utpal();
		ob.show();
	}
}
		