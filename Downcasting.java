class DownCasting{
	public static void main(String...args){
		System.out.println("first statement");
		m("india");
		m(76);
		System.out.println("last statement");
	}
	static void m(Object o){
		Integer i=(Integer)o;
	}
}