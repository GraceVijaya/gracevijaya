interface A
{
default void display()
{
System.out.println("this is default method");
}
public static void main(String...args)
{
A k=new A();
k.display();
}
}