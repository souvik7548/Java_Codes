class Animal{
	abstract void talk();
}
	class  Dog extends Animal{
		void talk(){
			System.out.println("dog barks");
		}
	}
	class Cat extends Animal{
		void talk(){
			System.out.println("cat mews");
		}
	}
	class Demo{
		void m(Animal ob){
			ob.talk();
		}
	}
	public class StringDemo{
		public static void main(String...args){
			demo d=new Demo();
			d.m(new Dog());
			d.m(new Cat());
			d.m(new Animal());
				void talk(){
					System.out.println("hi");
				
			}
		};
	}

			
			
			