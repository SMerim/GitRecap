package replitQuestions;
import java.util.*;
public class PrintUniqueNumber {
	/*
	 * Write a void method printUniqueNumbers that will print 
	 * unique numbers from an array of ints.`
	 *   ***unique   --> Meaning not same numbers
	 */
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	int[] nums = new int[size]; // create a an integer by size 
	for(int i = 0; i < size; i++) { // this loop iterates size times to read 
		//from the user and stores in nums variable
		nums[i] = scan.nextInt();
	}
	printUniqueNumbers(nums); // this is method from class 

	}
	
	//Method
	public static void printUniqueNumbers(int[] nums) {
		                       // int arrays 
		for(int i = 0; i< nums.length;i++) { // iterates through each element in the nums
			boolean isUniqueNums = true;  // until finds same number initialize as true
			for(int j = 0; j< nums.length; j++) { // inner loop  compares the every element nums[i]
				if(nums[i] == nums[j] && i != j ) { // check if nums i and nums j is equal and not equal
					isUniqueNums = false; // if duplicate number founded isUniqueNums become a false
					break;	
				}
				
			}
			if(isUniqueNums) { 
				System.out.println(nums[i]);  // Prints the unique nums
			}
		}
		
		
	}
	
	

}
