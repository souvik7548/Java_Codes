abstract class Animal{
	abstract void talk();
	abstract void show();
}
class Dog extends Animal{
	void talk(){
		System.out.println("baks");
	}
}
class Cat extends Animal{
	void talk(){
		System.out.println("mews");
	}
}
class Test{
	public static void main(String...args){
		Dog d=new Dog();
		d.talk();
		Cat c=new Cat();
		c.talk();
	}
}