/*
Remove Consecutive Duplicates
Send Feedback
For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
*/

// Solution - 



public class Solution {

	public static String removeConsecutiveDuplicates(String input) {
		//Your code goes here
        String result = "";
		char ch = input.charAt(0);
		result += ch;
		for(int i = 1;i < input.length();i++) {
			if(input.charAt(i) == ch);
			else 
				result += input.charAt(i);
			ch = input.charAt(i);
		}
		return result;
	}
}
