
import java.util.Scanner;
public class Primeprint{
    public static void main(String[] args) {
        int i,count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range :");
        int n = sc.nextInt();
        System.out.println("Prime number between 1 to "+n+" are:");
        for( int j=2;j<=n;j++){
            count = 0;
            for(i=1;i<=j;i++){
                if(j%i == 0){
                    count ++;
                }
            }
            if(count == 2){
                System.out.println(j+" ");
            }

        }

    }

}