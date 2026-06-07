// General Calculator 
// this project includes :
// 1- Celsius -> Fahrenheit
// 2- Normal Calculator
// 3- Grade Calculator
// 4- Odd/Even Checker
// 5- Factorial Calculator
// 6- Unit Converter hub


//The user will be prompted with a welcome message then with message that asks them about the type of calculation they want, 
//After that the program will prompt the user with what's needed to do that calculation.

import java.math.BigInteger;
import java.lang.Math;
import java.util.Scanner;



public class Main {
	public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
    	greetingUser();
}
    public static void greetingUser() {
        int selectedCalc = 0;
        
        // greeting the user
        System.out.println("Welcome to CalcKit a Java-based CLI app multi-tool calculator built to handle everyday math and conversions!(press enter to continue)");
        input.nextLine();
        System.out.println("""
                ================================
                    Welcome to CalcKit!
                ================================
                1- Normal Calculator
                2- Celsius to Fahrenheit
                3- Grade Calculator
                4- Odd/Even Checker
                5- Factorial Calculator
                6- Unit Converter
                0- Exit
                ================================
                """);
        // setting the type of the calculation
        selectedCalc = input.nextInt();
        
        
        // deciding the right method to use
       switch (selectedCalc) {
	case 1: 
		normalCalculator();
		break;
	case 2: 
		celsiusToFahrenheit();
		break;
	case 3: 
		gradeCalculator();
		break;
	case 4: 
		oddEvenChecker();
		break;
	case 5: 
		factorialCalculator();
		break;
	case 6: 
		unitConverter();
		break;
	case 0: 
		System.out.println("U Selected Calculatin" + selectedCalc);
		break;	
	default:
		System.out.println("ERROR: Please select One of the listed Calculations");
	}
    
    }
    
    
    // initializing normalCalculator method
    public static void normalCalculator() {
    	
    	//initializing the number 1 and 2 variables with the op variable
    	double num1,num2,result;
 	   	char op;
 	   	System.out.println("Welcome to the Normal Calculator!");
    	// taking inputs from the user
 	   	System.out.println("Please enter your first number:");
 	    num1 = input.nextDouble();
 	    System.out.println("Please enter your second number:");
 	    num2 = input.nextDouble();
 	    System.out.println("Please enter your operator(^ for power of 2):");
 	    op = input.next().charAt(0);
 	    
 	    // decding what mathmatic calculation to user
 	    switch (op) {
		
 	    case '+':
			result = num1 + num2;
			System.out.println(num1 + " " +op+ " " + num2 + " = "+result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " " +op+ " " + num2 + " = "+result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " " +op+ " " + num2 + " = "+result);
			break;
		case '/':
			// checking if that num1 was divided by 0
			if (num2 == 0){
				System.out.println("Undefined, Cannot divide by zero");
				break;
			}
			// if it's not then do a normal division
			else {
			result = num1 / num2;
			System.out.printf(num1 + " " +op+ " " + num2 + " = "+"%.1f%n",result);
			break;
			
			}
        case '^':
            result = Math.pow(num1, 2);
            System.out.println(num1 +op+(2)+ " = "+result);
            break;
		default:
			System.out.println("ERROR: Please Enther A Valid Operator");;
		}
    	
    } 
    
    
    // initializing celsiusToFahrenheit method
    public static void celsiusToFahrenheit() {
    	//F = (C × 9/5) + 32
    	//C = (F - 32) × 5/9
    	double c,f;
    	
    	System.out.println("Welcome to the Celsius to Fahrenheit Calculator!");
    	System.out.println("Convert to:");
    	System.out.println("1- Fahrenheit (from Celsius)");
    	System.out.println("2- Celsius (from Fahrenheit)");
    	System.out.print("Choose: ");
    	
    	int choice = input.nextInt();
    	
    	switch (choice) {
		case 1: 
			System.out.print("Enter temperature (°C): ");
			//Taking input
			c = input.nextDouble();
			//calculating 
			f = (c * 9/5) + 32;
			//outputting
			System.out.println("\n+---------------------------+");
			System.out.printf( "|  %.1f°C  =  %.1f°F  |%n", c, f);
			System.out.println("+---------------------------+");
			break;
		case 2:
			System.out.print("Enter temperature (°F): ");
			//Taking input
			f = input.nextDouble();
			//calculating 
			c = (f - 32) * 5/9;
			//outputting
			System.out.println("\n+---------------------------+");
			System.out.printf( "|  %.1f°F  =  %.1f°C  |%n", f, c);
			System.out.println("+---------------------------+");
			break;
		default:
			System.out.println("ERROR: Please Enter One Of The Listed Options");
		}
    }
    
    
    //initializing gradeCalculator method
    public static void gradeCalculator() {
    	
    	//general idea
    	//90-100  → A
    	//80-89   → B
    	//70-79   → C
    	//60-69   → D
    	//below 60 → F
    	
    	// initializing the variables
    	int allMarks = 0,mark;
    	double sum = 0;
    	//a counter for the loop
    	int counter = 0;
    	
    	double avrg = 0;
    	//taking input
    	System.out.println("Welcome to the Celsius to the Grade Calculator!");
    	System.out.println("Please Enter The Amount Of Marks You Want To Calculate!");
    	allMarks = input.nextInt();
    	// getting all the marks
    	for(int i = 0; i < allMarks;i++) {
    		counter += 1;
    		System.out.println("Please Enter Mark "+ counter);
    		mark = input.nextInt();
    		sum += mark;
    		mark = 0;
    	}
    	// calculating the average
    	avrg = sum / allMarks;
    	
    	//Checking the Rank of the average
    	if (avrg <= 100 || avrg >= 90){
    		System.out.println("\n-------- Grade Report --------");
    		System.out.printf("  Total Score    : %.2f%n", sum);
    		System.out.printf("  Average        : %.2f%n", avrg);
    		System.out.printf("  Letter Grade   : %s%n", "A");
    		System.out.println("------------------------------");
    	}
    	else if (avrg <= 89 || avrg >= 80) {
    		System.out.println("\n-------- Grade Report --------");
    		System.out.printf("  Total Score    : %.2f%n", sum);
    		System.out.printf("  Average        : %.2f%n", avrg);
    		System.out.printf("  Letter Grade   : %s%n", "B");
    		System.out.println("------------------------------");
		}
    	else if (avrg <= 79 || avrg >= 70) {
    		System.out.println("\n-------- Grade Report --------");
    		System.out.printf("  Total Score    : %.2f%n", sum);
    		System.out.printf("  Average        : %.2f%n", avrg);
    		System.out.printf("  Letter Grade   : %s%n", "C");
    		System.out.println("------------------------------");
		}
    	else if (avrg <= 69 || avrg >= 60) {
    		System.out.println("\n-------- Grade Report --------");
    		System.out.printf("  Total Score    : %.2f%n", sum);
    		System.out.printf("  Average        : %.2f%n", avrg);
    		System.out.printf("  Letter Grade   : %s%n", "D");
    		System.out.println("------------------------------");
		}
    	else {
    		System.out.println("\n-------- Grade Report --------");
    		System.out.printf("  Total Score    : %.2f%n", sum);
    		System.out.printf("  Average        : %.2f%n", avrg);
    		System.out.printf("  Letter Grade   : %s%n", "F");
    		System.out.println("------------------------------");
		}
    	
    }
    
    
    //initializing oddEvenChecker method
    public static void oddEvenChecker() {
    	//if (n % 2 == 0) → Even
    	//else            → Odd
    	
    	//initializing the variables 
    	double number;
    	System.out.println("Welcome to the Odd/Even Checker!");
    	System.out.println("Please enter the number you want to check!");
    	number = input.nextInt();
    	
    	if(number % 2 == 0) {
    		System.out.println("The number "+number+" is Even!");
    	}
    	else {
    		System.out.println("The number "+number+" is Odd!");
		}
    }
    
    
    //initializing factorialCalculator method
    public static void factorialCalculator() {
    	int number;
    	BigInteger result = BigInteger.ONE;
    	
    	System.out.println("Welcome to the Factorial Calculator!");
    	System.out.println("Enter a number to calculate its factorial: ");
    	number = input.nextInt();
    	//checking false input
    	if (number < 0) {
    	    System.out.println("Error: Factorial of a negative number is undefined!");
    	}
    	else {
        	//calulating 
        	for(int i = 1;i <= number;i++) {
        		result = result.multiply(BigInteger.valueOf(i));
        	}
        	//printing out the result
        	System.out.println(number+"! "+"= "+ result);
		}

    	
    }
    
    
    //initializing unitConverter method
    public static void unitConverter() {
    	int choice;
    	System.out.println("Welcome to the Unit Converter!");
    	System.out.println("""
    			Please Choose The Unit of Measurement:
    			1- Distance(km/miles)
    			2- Weight(kg/lbs)
    			3- Volume(liters/gallons)
    			""");
    	choice = input.nextInt();
    	//choosing the method
    	switch (choice) {
    	case 1:
    		calcDistance();
			break;
    	case 2:
    		calcWeight();
			break;
    	case 3:
    		calcVolume();
			break;
    	default:
			System.out.println("ERROR: Please Enter One Of The Listed Options");
    	}

	}
    
    
    //initializing calcDistance method for the unitConverter method
    public static void calcDistance() {
	int choice;
	double km,miles;
	//taking input
	System.out.println("Choose The Type Of Convertion You Want:");
	System.out.println("""
			1-km -> miles
			2-miles -> km
			""");
	choice = input.nextInt();
	// calculating 
	switch (choice) {
        case 1:
            System.out.println("Enter the Distance in km");
            km = input.nextDouble();
            miles = km * 0.621371;
            System.out.printf("%.1fkm = %.1f miles%n", km, miles);
            break;
        case 2:
            System.out.println("Enter the Distance in miles");
            miles = input.nextDouble();
            km = miles * 1.60934;
            System.out.printf("%.1f miles = %.1fkm%n", miles, km);
            break;
	default:
		System.out.println("ERROR: Please Enter One Of The Listed Options");
	}
    }
    
    
    //initializing calcWeight method for the unitConverter method
    public static void calcWeight() {
    	int choice;
    	double kg,lbs;
    	//taking input
    	System.out.println("Choose The Type Of Convertion You Want:");
    	System.out.println("""
    			1-kg -> lbs
    			2-lbs -> kg
    			""");
    	
    	choice = input.nextInt();
    	// calculating 
    	switch (choice) {
            case 1:
                System.out.println("Enter the Weight in kg");
                kg = input.nextDouble();
                lbs = kg * 2.20462;
                System.out.printf("%.1fkg = %.1f lbs%n", kg, lbs);
                break;
            case 2:
                System.out.println("Enter the Weight in lbs");
                lbs = input.nextDouble();
                kg = lbs * 0.453592;
                System.out.printf("%.1f lbs = %.1fkg%n", lbs, kg);
                break;
    	default:
			System.out.println("ERROR: Please Enter One Of The Listed Options");
    	}
    	
    }
    
    
    //initializing calcVolume method for the unitConverter method
    public static void calcVolume() {
    	int choice;
    	double liters,gallons;
    	//taking input
    	System.out.println("Choose The Type Of Convertion You Want:");
    	System.out.println("""
    			1-liters -> gallons
    			2-gallons -> liters
    			""");
    	choice = input.nextInt();
    	// calculating 
    	switch (choice) {
            case 1:
                System.out.println("Enter the Volume in liters");
                liters = input.nextDouble();
                gallons = liters * 0.264172;
                System.out.printf("%.1f liters = %.1f gallons%n", liters, gallons);
                break;
            case 2:
                System.out.println("Enter the Volume in gallons");
                gallons = input.nextDouble();
                liters = gallons * 3.78541;
                System.out.printf("%.1f gallons = %.1f liters%n", gallons, liters);
                break;
    	default:
			System.out.println("ERROR: Please Enter One Of The Listed Options");
    	}

    }
}



