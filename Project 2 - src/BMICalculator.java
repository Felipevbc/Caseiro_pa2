import java.util.*;


public class BMICalculator {
	
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
        
    // Prompt the user for a unit system
        System.out.println("Please select the preferred unit system: 1. Metric  2. Imperial\n");
        
    
        int choice = console.nextInt();
        
        
    //Metric system option
        if(choice == 1) {
        	
    //Prompt the user for the height
            System.out.println("Enter Height in Centimeters: ");
            double centimeters = console.nextInt();   
    //Convert centimeters into meters
	    double height = centimeters/100;
    //Prompt the user for weight        
            System.out.println("\nEnter Weight in Kilograms: ");
            double weight = console.nextDouble();
            
    //Calculate the bmi    
            double bmi = (weight / (height*2));
          
       
            if (bmi >= 0) {
            System.out.printf("Your BMI is %.1f\n",bmi);
            } else {
            	System.out.printf("\nInvalid Entry");
            }
            
            
            if(bmi >= 0) {
            	if (bmi < 18.5) {
            		System.out.println("You are underweight");
                
            	} else if (bmi < 25) {
            		System.out.println("You are at normal weight");
                
            	} else if (bmi < 30) {
            		System.out.println("You are overweight");
                
            	} else {
            		System.out.println("You are a Obese");               
            }
        }
     }
            	
          
        if(choice == 2) {
        	
        
        	System.out.println("\nEnter Height in Feet: ");
            double impFeet = console.nextInt();
        	
            System.out.println("\nEnter additional Height in Inches: ");
        	double impHeight = console.nextDouble();
        	
        
        	impHeight = impFeet*12 + impHeight;
        
        	System.out.println("\nEnter Weight in Pounds: ");     
        	double impWeight = console.nextDouble();
        	
        
        	double impBmi = (impWeight * 703 / impHeight / impHeight);
        
        
        	   if (impBmi >= 0) {
                   System.out.printf("\nBMI = %.1f\n",impBmi);
                   } 
		
		else {
                   	System.out.printf("Invalid Entry");
                   }
        
        	
        	  if(impBmi >= 0) {
        		if (impBmi < 18.5) {
        			System.out.println("You are underweight");
            
        		} else if (impBmi < 25) {
        			System.out.println("You are at a normal weight");
            
        		} else if (impBmi < 30) {
        			System.out.println("You are overweight");
            
        		} else {
        			System.out.println("You are obese");  
        		}
        	}
        }
    }
}
