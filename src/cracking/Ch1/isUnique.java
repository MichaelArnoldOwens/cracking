/* 
By Michael Owens
*/

import java.util.*;

public class isUnique {

	//given a string, determines if all characters in it are unique or not
	//assumes that we are using ascii character set
	public static boolean isUnique(String str){
		
		//creating an array to check if that character has been read before
		//array is auto initialized to false
		boolean char_set[] = new boolean[256];
		
		//since we are using ascii, the max length of string for all characters to be unique can only be 256
		if(str.length() > 256) {
			return false;
		}
		
		//loop through checking each character if it has been read before
		for(int i = 0; i < str.length(); i++){
			int letter = str.charAt(i);
			if(char_set[letter] == true) {
				return false;
			}
			char_set[letter] = true;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		System.out.println("HelloWorld!");
		//reading user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string:");
		String user_input = input.nextLine();
		
		if(isUnique(user_input)){
			System.out.println("All characters are unique!");
		}
		else {
			System.out.println("All characters are not unique!");
		}
		input.close();
	}
}
