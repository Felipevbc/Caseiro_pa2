public class Decrypter {

	public static int Decrypt(int number) 
	{
	   int DecryptedNumber;
	   //Get the four new digits from the decrypted number
	   int firstnum = (number/1000);
	   int secondnum = ((number % 1000)/100);
	   int thirdnum = ((number % 100) / 10);
	   int fourthnum = (number % 10);
	   
	  //Decrypt the numbers into the original digits 
	  firstnum = firstnum - 7;
	  if (firstnum < 0) firstnum += 10;
	   	
	  secondnum = secondnum - 7;
	  if (secondnum < 0) secondnum += 10;
		
	  thirdnum = thirdnum - 7;
	  if (thirdnum < 0)  thirdnum += 10;
		
	  fourthnum = fourthnum - 7;
	  if (fourthnum < 0) fourthnum += 10;
	  //Reorganize the numbers and return the already decrypted number	
	  DecryptedNumber = (thirdnum * 1000 + fourthnum * 100 + firstnum * 10 + secondnum);	
	  return DecryptedNumber;
	}
}
