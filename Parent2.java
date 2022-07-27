class Parent{
	void show(){
		System.out.println("show from parent");
	}
}
	class Child extends Parent{
		void show(){
			System.out.println("show from child");
		}
		public static void main(String...args){
			Parent p=new Child();
			p.show();
		}
	}