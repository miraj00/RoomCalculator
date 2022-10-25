import java.io.*;
import java.util.Scanner;

public class RoomCalculator {

	
	
	public static void main (String[] args) {
		
		float length, width, height;         // accept float (decimal values ) 
		int area, perimeter, volume;         // using Math.round and showing result in int value   
		char a1 = 'y';
	    char response;
		
			Scanner sc = new Scanner(System.in);
				
			System.out.println("Welcome to Grand Circus’ Room Detail Generator!");
		

			System.out.println("Enter Length  :");
		    length = sc.nextFloat();
			
			System.out.println("Enter Width :");
		    width = sc.nextFloat();
			
			System.out.println("Enter Height :");
		    height = sc.nextFloat();
	


			float area1 = length * width;                                     // ( area = multiplication of l and w )
			area = Math.round(area1);
			System.out.println("Area :" + area );
			
			float perimeter1 = (length * 2) + ( width *2 );                   // ( perimeter = total length of all sides  )
			perimeter = Math.round(perimeter1);
			System.out.println("Perimeter : " + perimeter );
				
			float volume1 = length * width * height;                          // ( volume = multiplication of l, w & h)
			volume = Math.round(volume1);
			System.out.println("Volume :" + volume );
 	
	
	
	        System.out.print("Continue ? (Y/N) : "); 
            String var= sc.next();
   
            if(var.equalsIgnoreCase("Y")){                                   // Matches "Y" or "y"
     
            main(null);                                                      // if input is Y then call main method again to repeat questionaire. 
            }
	}

}		





/*  *******************************  Requirements  *********************************

Room Calculator
Expressions, Variables
Task: Calculate the perimeter and area of various classrooms at Grand Circus based on user input.

What will the application do?
Prompt the user to enter values of length and width of the classroom.
Display the area and perimeter of that classroom.
Ask if the user wants to continue (keep measuring rooms!).

Build Specifications
Assume that the rooms are perfect rectangles.
Assume that the user will enter valid numeric data for length and width.
Accept decimal entries (12.5, for instance).

Hints:
Don’t mess up the formulas for area or perimeter.
The Snug is 24’ 6” x 20’ 0”. The Penthouse is 42’ 6” x 16’ 6”. 
ZyBook Chapters 1 and 2.
Extra Challenges:
The application should continue only if the user agrees to.
Calculate the volume of the rooms.

Console Preview: 

Welcome to Grand Circus’ Room Detail Generator!

Enter Length: {user input here, for example: 24.5}
Enter Width: {user input here, for example: 20}
Area: {output here, for example: 490}
Perimeter: {output here, for example: 89}

Continue? (y/n): {user input here, for example: Y}

Enter Length: {3}
Enter Width: {4}
Area: {12}
Perimeter: {14}
…

*/