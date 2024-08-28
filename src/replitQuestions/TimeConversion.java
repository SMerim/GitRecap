package replitQuestions;
import java.util.*;
public class TimeConversion {
	/*
	 * Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.
	 *  Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
	 *  Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
	 * The timeConversion method should convert and print the given number (String
	 * argument)
	 * Input: 07:05:45PM
       Output: 19:05:45
	 */

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	timeConversion(scan.nextLine());

	}
	public static void timeConversion(String s) {
		//Split the time 07:05:45PM by colon
		String[] parts = s.split(":");
		
		//  07  -->  :--> 05--> :  -->45PM 
		// parts[0]   parts[1]   parts[2] 
		String hours = parts[0]; // 1 element
		String minutes = parts[1]; // 2 element
		String second = parts[2].substring(0,2); // 3rd element substring starting from 0 index ending with 2nd index
		String amPm = parts[2].substring(2);  // 3rd element but end of the string 2 index / AM/PM Remaining part 
		String newHours;   // the variable to store the converted hours
		if(amPm.equals("AM")) { // if time is equals to "AM" 
			if(hours.equals("12")) { // if hours are 12 AM
				newHours = "00";	 // than newHours will 00 --> convert 12 to 00
			}else {
				newHours = hours; // if it's not keep newHours same  as hours
			}
		}else {  // this is part of first if // if the time is in PM not AM 
			if(hours.equals("12")) { // if hours equal to 12
				newHours = "12"; // Keep 12 PM as 12 hours
			}else { // otherwise  Convert PM hours to 24-hours format by adding 12 hours to given hours
				newHours = String.valueOf(Integer.parseInt(hours) + 12);
			}
		}
		System.out.println(newHours + ":" + minutes + ":" + second);
		
	}

}








