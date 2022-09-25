import java.util.*;

class Matrix{
    void SumDiagonals (int[][]a,int m,int n){
        int sum = 0;
        int sum1 = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if (i==j)
                sum+= a[i][j];               
                if(i==n-j-i)
                sum1 += a[i][j];
                
            }
                System.out.println("Diagonal 1 :"+sum);
                System.out.println("Diagonal 2 :"+sum1);
            }
}
}
public class Ass2Q2{     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int i,j,row,col;
            System.out.println("Enter the number of rows and columns :");
            row = sc.nextInt();
            col = sc.nextInt();
            int mat[][] = new int [row][col];
            System.out.println("Enter the elements :");
            for(i=0;i<row;i++){
                for(j=0;j<col;j++){
                    mat[i][j] = sc.nextInt();
                }
            }  
            Matrix ob = new Matrix();
            ob.SumDiagonals(mat,row,col);
    }
}



