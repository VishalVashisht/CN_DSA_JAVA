/*
Return Permutations - String

Given a string S, find and return all the possible permutations of the input string.
Note 1 : The order of permutations is not important.
Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
Input Format :
String S
Output Format :
All permutations (in different lines)
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba
*/


// Solution - 

// public class solution {
// 	public static String[] permutationOfString(String input){
// 		// Write your code here
// 	}
// }

public class solution {
	
	public static String[] permutationOfString(String input){
		// Write your code here
        if(input.length() == 0){
          return new String[1]; 
        }
        if(input.length() == 1){
            String[] arr = new String[1];
            arr[0] = input;
            return arr;
            
        }
		char c = input.charAt(0);
        String[] temp = permutationOfString(input.substring(1));
        String[] output = new String[temp.length * input.length()];
        int k = 0;
        for(int i =0; i< temp.length; i++){
            String newstr = temp[i];
            for(int j=0; j<newstr.length();j++){
               output[k] = newstr.substring(0,j)+c+newstr.substring(j);
                k = k + 1;
            }
            output[k] = newstr + c;
            k = k + 1;
            
        }
        return output;
	}
}

