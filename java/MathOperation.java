import java.util.Scanner;
public class MathOperation{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number");
int a = sc.nextInt();
System.out.println("Enter Second number");
int b = sc.nextInt();
System.out.println("Addition two number " +(a+b));
System.out.println("Subtraction two number " +(a-b));
System.out.println("Multiplication two number "+ (a*b));
System.out.println("Division two number "+ (a/b));
}
}