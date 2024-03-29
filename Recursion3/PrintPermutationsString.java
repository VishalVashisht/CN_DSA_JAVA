/*
Print Permutations

Given an input string (STR), print all possible permutations of the input string.
Note:
The input string may contain the same characters, so there will also be the same permutations.
The order of permutations doesn’t matter.
Input Format:
The only input line contains a string (STR) of alphabets in lower case
Output Format:
Print each permutations in a new line
Constraint:
1<=length of STR<=8
Time Limit: 1sec
Sample Input 1:
cba
Sample Output 1:
abc
acb
bac
bca
cab
cba
*/


// Solution - 

// public class Solution {
// 	public static void FindPermutations(String str) {
// 		// Write your code here
// 	}
// }

public class Solution {
	public static void FindPermutations(String str) {
		// Write your code here
		print(str,"");

	}

	public static void print(String input,String output){
		if(input.length()==0){
			System.out.println(output);
			return;
		}

		for(int i =0;i<input.length();i++){
			char c = input.charAt(i);
			String remaining = input.substring(0, i)+input.substring(i+1);
			
			print(remaining,output+c);
		}
	}
}
