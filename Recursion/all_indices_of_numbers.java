/*
All Indices of Number

Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
*/

// Solution - 



public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return helper(input, x, 0);
	}
    
    private static int[] helper(int arr[], int x, int si){
        if(si == arr.length){
            int arrT[] = new int[0];
            return arrT;
        }
        
        int sa[] = helper(arr, x, si+1);
        
        if(arr[si] == x){
            int arrN[] = new int[sa.length+1];
            arrN[0] = si;
            
            for(int i=0; i<sa.length; i++){
                arrN[i+1] = sa[i];
            }
            
            return arrN;
        }
        else{
            return sa;
        }
		
    }
}
