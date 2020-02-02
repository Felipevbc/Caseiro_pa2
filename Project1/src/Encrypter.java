public class Encrypter {
	
public static int Encrypt(int number)
{
	   int ReorganizedNumber = 0;
	   
	   //Divide the number into four different digits
	   int firstnum = (number / 1000);
	   int secondnum = (number % 1000) / 100;
	   int thirdnum = (number % 100) / 10;
	   int fourthnum = (number % 10);
	   
	   //Find the new digits for each number
	   firstnum = (firstnum + 7) % 10;
	   secondnum = (secondnum + 7) % 10;
	   thirdnum = (thirdnum + 7) % 10;
	   fourthnum = (fourthnum + 7) % 10;
	   
	   //Reorganize the four digits into a single number
	   ReorganizedNumber = (third * 1000 + third * 100 + first * 10 + second);
	   
	   //Return the number
	   return ReorganizedNumber;
	}
}
