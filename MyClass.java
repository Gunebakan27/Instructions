package day12variabletypesmethodoverloadingconstructors;
public class MyClass
{
int x; 
static int y;

MyClass(int i)
{
x+=i;
y+=i;
}
public static void main(String[] args)
{
new MyClass(2); 
MyClass mc = new MyClass(3); 
System.out.print(mc.x + "," + mc.y);
}}