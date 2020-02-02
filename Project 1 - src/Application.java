import java.util.Scanner;


public class Application {
	
	public static void main(String[] args) {
		
  try (Scanner integer = new Scanner(System.in)) {
		int n;
			
			System.out.println("Select Method: 1. Encryption or 2. Decryption");
			int choice = integer.nextInt();
			
			if (choice == 1 ) {
		
			System.out.println("\nEnter a four digit number:");	
			n = integer.nextInt();
			
	
			System.out.println("\nThe encrypted number is: " +Encrypter.encrypt(n));
			}
			
			if (choice == 2 ) {
				
				System.out.println("\nEnter a four digit number:");	
				n = integer.nextInt();
				
				System.out.println("\nThe decrypted number is: " +Decrypter.decrypt(n));
			}
		}
	}
}
