import java.util.Scanner;

//Declare the Application class
public class Application {
	
	public static void main(String[] args) {
		
 	int number;
			//Prompt the user for an option and scan it
			System.out.println("What do you want to do? : 1. Encrypt my number or 2. Decrypt my number");
			int choice = integer.nextInt();
			
	  			//Encryption choice
				if (choice == 1 ) {
					//Prompt for user input
					System.out.println("Enter your number: \n");	
					number = integer.nextInt();
					//Print the number(already encrypted) onto the screen
					System.out.println("\nThe encrypted number is: " +Encrypter.encrypt(number));
			}
			
	  			//Decryption choice
				if (choice == 2 ) {
					//Prompt the user for a number
					System.out.println("Enter your number: \n");	
					number = integer.nextInt();
					//Print the decrypted number onto the screen
					System.out.println("After being decrypted, the number is: " +Decrypter.decrypt(number));
			}
				//Third choice, the wrong one
			 	else System.out.println("You chose... poorly");
		}
}
