package cracking;

import java.util.*;

public class test {

	public static boolean isUnique(String str){
		
		boolean char_set[] = new boolean[256];
		
		if(str.length() > 256) {
			return false;
		}
		
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
