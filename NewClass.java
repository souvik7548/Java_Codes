public class NewClass{
	static int i;
	public static void main(String...args){
		System.out.println("1st statement");
		/*System.out.println(i.intValue());*/
		System.out.println("3rd statement");
		show("tom");
	}
	static void show(String msg){
		
		System.out.println(msg.toUpperCase());
	}
}