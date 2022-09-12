import java.util.Scanner;
class calculate{
int x,y;
void add(){
int add = x+y;
System.out.println("Sum of two numbers: "+add);
}
void sub(){
int sub = x-y;
System.out.println("Subtraction of two number: "+sub);
}
void mul(){
int mul = x*y;
System.out.println("multiplication of two number: "+mul);
}
void div(){
int div = x/y;
System.out.println("Division of two number: "+div);
}
void show(){
add\();
sub();
mul();
div();
}
}
public class calculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number: ");
int a1 = sc.nextInt();
System.out.println("Enter the second number: ");
int a2 = sc.nextInt();
calculate obj = new calculate();
obj.x = a1;
obj.y = a2;
obj.show();
}
}