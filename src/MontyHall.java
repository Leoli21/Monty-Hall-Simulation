import java.util.Random;
import java.util.Scanner;


public class MontyHall {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int winDoor, userDoor, goatDoor, switchDoor;
		winDoor = rand.nextInt(3) + 1;
		goatDoor = 0;
		switchDoor = 0;
		
		
		System.out.println("Which door would you like to pick: ");
		userDoor = input.nextInt();
		while (userDoor > 3 || userDoor < 0) {
			System.out.println("Please choose a door (1,2,3): ");
			userDoor = input.nextInt();
		}
		
		if (userDoor == winDoor)
		{
			if (userDoor == 1)
			{
				goatDoor = 2;
				switchDoor = 3;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}
			else if (userDoor ==2)
			{
				goatDoor = 3;
				switchDoor = 1;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}
			else 
			{
				goatDoor = 1;
				switchDoor = 2;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}
		}
		else
		{
			if (userDoor == 1 && winDoor == 2)
			{
				goatDoor = 3;
				switchDoor = 2;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}
			else if (userDoor == 1 && winDoor == 3)
			{
				goatDoor = 2;
				switchDoor = 3;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}
			else if (userDoor == 2 && winDoor == 1)
			{
				goatDoor = 3;
				switchDoor = 1;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}
			else if (userDoor == 2 && winDoor == 3)
			{
				goatDoor = 1;
				switchDoor = 3;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}
			else if (userDoor == 3 && winDoor == 1)
			{
				goatDoor = 2;
				switchDoor = 1;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}
			else if (userDoor == 3 && winDoor == 2)
			{
				goatDoor = 1;
				switchDoor = 2;
				System.out.println("There is a goat behind Door #" + goatDoor);
				System.out.println("Would you like to switch doors (Y/N)?: ");	
			}

		}
		char userAnswer = input.next().charAt(0);
		while (!(userAnswer == 'Y' ||  userAnswer =='N'))
		{
				System.out.println("Please enter Y/N: ");
				userAnswer = input.next().charAt(0);
		}

		if  (userAnswer == 'Y')
		{
			userDoor = switchDoor;
				
			System.out.println("The car is behind door number # " + winDoor);
		
			if (userDoor == winDoor) 
			{
				System.out.println("You win");
			}
			else
			{
				System.out.println("You lost");
			}
			
	}
		else
		{
			System.out.println("The car is behind door number # " + winDoor);
			
			if (userDoor == winDoor) 
			{
				System.out.println("You win");
			}
			else
			{
				System.out.println("You lost");
			}
		}

}
}
