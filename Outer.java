class Outer{
int a=20;
static int b=30;
static class Nested{
int x=10;
static int y=50;

public static void main(String...args){
Outer ob=new Outer();
System.out.println("a="+ob.a);
System.out.println("b="+Outer.b);

System.out.println("y="+y);

}
}
}