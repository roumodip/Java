import java.util.*;
public class checkalphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      char ch = sc.next().trim().charAt(0);
//      String u = "Word";
         if (ch>= 'a' && ch<= 'z'){
             System.out.println("lowercase");
         }
        else{
             System.out.println("Uppercase");
         }
    }

}
