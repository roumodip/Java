import java.util.Scanner;
public class loop {

	public static void main(String[] args) {

String color;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Signal Colour(green/yellow/red) :");
		color=a.nextLine();
		
		switch(color)
		{
		case "green":
		{
			System.out.println("You are Allowed to Go.");
			break;
		}
		case "yellow":
		{
			System.out.println("Please Wait!");
			break;
		}
		case "red":
		{
			System.out.println("Please Stop");
		}
		}

}

}