import java.util.Scanner;
public class TextGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0;
		int com;
		System.out.println("Welcome to World of TextCraft!\n------------------------------");
		System.out.println("You are currently at (" + x + ", " + y + ")");
		System.out.println("Enter command (1 = North, 2 = East, 3 = South, 4 = West, 5 = Exit)");
		com = input.nextInt();
		while (com != 5){
		if (com == 1){
			y+=1;
			System.out.println("Moving north");
			System.out.println("You are currently at (" + x + ", " + y + ")");
			System.out.println("Enter command (1 = North, 2 = East, 3 = South, 4 = West, 5 = Exit)");
			com = input.nextInt();
		} else if(com ==2){
			x+=1;
			System.out.println("Moving east");
			System.out.println("You are currently at (" + x + ", " + y + ")");
			System.out.println("Enter command (1 = North, 2 = East, 3 = South, 4 = West, 5 = Exit)");
			com = input.nextInt();
		} else if(com == 3){
			y-=1;
			System.out.println("Moving south");
			System.out.println("You are currently at (" + x + ", " + y + ")");
			System.out.println("Enter command (1 = North, 2 = East, 3 = South, 4 = West, 5 = Exit)");
			com = input.nextInt();
		} else if (com == 4){
			x-=1;
			System.out.println("Moving west");
			System.out.println("You are currently at (" + x + ", " + y + ")");
			System.out.println("Enter command (1 = North, 2 = East, 3 = South, 4 = West, 5 = Exit)");
			com = input.nextInt();
		} else{
			System.out.println("Thou dost entered an invalid command.");
			com = input.nextInt();
		}
		}
		System.out.println("Dost thou leave so soon? Fare thee well!");
}
}