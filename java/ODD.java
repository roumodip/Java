public class ODD{
public static void main(String[] args){
A ob = new A();
ob.displayOdd(1,100);
}
}

class A
{
void displayOdd(int number,int end)
{
if (number>end)
return;
if (number%2!= 0){
System.out.println(number+" ");
displayOdd(number+2,end);
}
else{
displayOdd(number+1,end);
}
}
}
