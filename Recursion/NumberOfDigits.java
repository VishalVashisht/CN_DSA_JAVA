/*
Number of Digits

Given the number 'n', find out and return the number of digits present in a number recursively.
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
*/


// Main Code - 

import java.util.Scanner;

public class Runner {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.count(n));
	}
	
}

// Solution Code -

public class Solution {

	public static int count(int n){
		//Write your code here
        
        if(n==0){
            return 0;
        }
        
        int smallAns = count(n/10);
        return smallAns+1;
    }
}
