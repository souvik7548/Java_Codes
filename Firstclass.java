class Calculator{
	void add(int a,int b){
		System.out.print("sum="+(a+b+c));
	}
	void add (int a,int b,int c){
		System.out.print("sum="+(a+b+c));
	}
	float add (float f1,float f2,float f3,float f4){
		return f1+f2+f3+f4;
	}
	void add(float a,int b){
		System.out.println("sum=="+(a+b));
	}
	public static void main(String [] args){
		Calculator c=new Calculator();
		c.add(12,34);
		c.add(45,56);
		c.add(11.23f,3.3f,4.6f,5.6f);
		c.add(3456.f,123);
	}
}
		