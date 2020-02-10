import java.util.Scanner;
import java.math.*;
public class proj1 {

//main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare scanner object
  Scanner keyboard = new Scanner(System.in);
//declare variables
  int windSpeed;
  int temp;
  double windSpeedToPower;
  final double power = 0.16;
  double windChill;
//title of program
  System.out.println("Wind Chill Calculator\n\n");
//prompt for temp input
  System.out.println("Please enter the tempature in farenheit (must be in between or including -45 to 40): ");
//temp input
  temp = keyboard.nextInt();
//input validation for temp
  while (temp <-45 || temp > 40)
  {
	  System.out.println("Sorry, that number is invalid. Please try again and enter a tempature between or including -45 to 40: ");
	  temp = keyboard.nextInt();
  }
//prompt for windSpeed
  System.out.println("Please enter the windspeed in miles per hour (must be in between or including 5 to 60): ");
//windSpeed input
  windSpeed = keyboard.nextInt();
//input validation for windSpeed
  while (windSpeed <5 || windSpeed > 60)
  {
	  System.out.println("Sorry, that number is invalid. Please try again and enter a value between or including 5 to 60 mph: ");
	  windSpeed = keyboard.nextInt();
  }
//calculating v^.16 for formula
  windSpeedToPower = Math.pow(windSpeed, power);
//calc windChill
  windChill = 35.74 + (0.6215*temp) - (35.75 * windSpeedToPower) + (0.4275 * temp * windSpeedToPower) ;
//print windChill
  System.out.println("The wind chill is " + windChill + " farenheit.");
//print programmer
  System.out.println("\nProgrammer: Daniel Sukinik");
//exit program30
  System.exit(0);
	}

}
