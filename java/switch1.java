import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "apple":
            {
                System.out.println("this is sweet red fruit");
            }break;
            case "mango":
            {
                System.out.println("King of all fruit");
            }break;
            case "pineapple":
            {
                System.out.println("cactus fruit");
            }break;
            case "coconut":
            {
                System.out.println("hard fruit");
            }
            default:
            {
                System.out.println("Invalid value!!");
            }



        }

    }
}
