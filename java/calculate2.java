import java.util.Scanner;
class calculate2{
void add(int x,int y){
int add = x+y;
System.out.println("Sum is :"+add);
}
void sub(int x,int y){
int sub = x-y;
System.out.println("Sub is :"+sub);
}
void mul(int x,int y){
int mul = x*y;
System.out.println("multi is :"+mul);
}
void div(int x,int y){
int div = x/y;
System.out.println("div is :"+div);
}
void show(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number ");
int a1 = sc.nextInt();
System.out.println("Enter the second number ");
int a2 = sc.nextInt();
add(a1,a2);
sub(a1,a2);
mul(a1,a2);
div(a1,a2);
}
public static void main(String[] args){
calculate2 ob = new calculate2();
ob.show();
}
}





