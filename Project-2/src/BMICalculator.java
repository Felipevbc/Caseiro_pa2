import java.util.*;


public class BMICalculator {
	
    public static void main(String[] args) {
    	
        Scanner console = new Scanner(System.in);
        
        //Prompt the user for a unit system and scan it
        System.out.println("Please select the preferred unit system: 1. Metric  2. Imperial\n");
        int choice = console.nextInt();
        //Algorithm for the choice in terms of the metric system
        if(choice == 1) {
            //prompt for the height in centimeters and scan it
	    System.out.println("Please enter your height in centimeters: \n");
            double cm = console.nextInt();   
            double height = cm/100;
            //prompt for the weight in kilograms and scan it
            System.out.println("Please enter your weight in kilograms: \n");
            double weight = console.nextDouble();
            //Calculate the BMI and print it
	    double bmi = (weight / (height*2));
            if (bmi >= 0) System.out.printf("Your BMI is %.1f \n",bmi);
            
	    else System.out.printf("\nInvalid Entry");
            //Present the option according to the user's BMI
            if(bmi >= 0) {
            	if (bmi < 18.5) System.out.println("You are underweight");
                
            	else if (bmi < 25) System.out.println("You have a normal weight");
                
            	else if (bmi < 30) System.out.println("You are overweight");
                
            	else System.out.println("You are Obese");               
            }
        }
     
            	
        // Algorithm for the choice in terms of the imperial system system
        if(choice == 2) {
        	
            
           System.out.println("Enter your height in term of Inches: \n");
           double Height2 = console.nextDouble();
            
	   System.out.println("\nEnter your weight in Pounds: \n");     
           double Weight2 = console.nextDouble();
        	
           double Bmi2 = (Weight2*703/Height2*2);
        
        
            if (Bmi2 >= 0) System.out.printf("\nBMI = %.1f\n",Bmi2);
                    
		
            else System.out.printf("You chose...poorly");
                   
            if(impBmi >= 0) {
        		if (impBmi < 18.5) System.out.println("You are underweight");
            
        		else if (impBmi < 25) System.out.println("You have a normal weight");
            
        	        else if (impBmi < 30) System.out.println("You are overweight");
            
        		else System.out.println("You are obese");  
     
        	
        }
    }
}
