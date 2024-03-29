/*
Print all Codes - String

Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. Just print them in different lines.
Input format :
A numeric string S
Output Format :
All possible codes in different lines
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw
*/

// Solution - 

// public class solution {
// 	public static void printAllPossibleCodes(String input) {
// 		// Write your code here
// 	}
// }

public class solution {

	   private static void printAllPossibleCodes(String input, String output){
	        
	        int len = input.length();
	        if (len==0){
	            System.out.println(output);
	            return;
	        }
	        
	        char firstChar = (char)((input.charAt(0)-'0'+'a'-1));
	        printAllPossibleCodes(input.substring(1), output + firstChar);
	        
	        if (input.length()>=2){
	            char firstTwoChar = (char)((input.charAt(0)-'0')*10 + (input.charAt(1)-'0')+'a'-1);
	            
	            if (firstTwoChar>='a' && firstTwoChar <='z'){
	                printAllPossibleCodes(input.substring(2), output + firstTwoChar);
	            }
	        }
	        // printAllPossibleCodes(input.substring(1), output);
	        // printAllPossibleCodes(input.substring(1),output + input.charAt(0));
	    }
	  

		public static void printAllPossibleCodes(String input) {
			// Write your code here
	        
	        //int start = 0;
	        String output = "";
	        printAllPossibleCodes(input,output);

		}
}
