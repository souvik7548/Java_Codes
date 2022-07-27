abstract class Test{
	abstract void show();
}

public  class StringDemo3{
	public static void main(String...args){
		Test ob=new Test(){
			void show(){
				System.out.println("show from anonymous");
			}
		};
		ob.show();
	}
}
		