import java.util.Scanner;
class Main{
public static void main(String[] args){
hehe h=new hehe();
h.checkPrime();
}
}
class hehe{
void checkPrime(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
boolean flag = false;
for(int i=2;i<=n/2;++i)
{
if(n%2==0)
{
flag = true;
break;
}
}
if(! flag)
{
System.out.println(n+" is a prime number");
}
else
{
System.out.println(n+" is not a prime number");
}
}
}


