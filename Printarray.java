import java.util.Scanner;
public class Printarray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int k;
k=sc.nextInt();
int arr[] = new int[k];
System.out.println("Enter array elements : ");
for(int i=0;i<k;i++){
arr[i]=sc.nextInt();
}
System.out.println("Elements in the array");
for(int i = 0;i <k;i++)
{
System.out.print(arr[i] + " ");
}
}
}
