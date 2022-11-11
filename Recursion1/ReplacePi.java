/*
Replace pi (recursive)

Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
Constraints :
1 <= |S| <= 50
where |S| represents the length of string S. 
Sample Input 1 :
xpix
Sample Output :
x3.14x
Sample Input 2 :
pipi
Sample Output :
3.143.14
Sample Input 3 :
pip
Sample Output :
3.14p
Constraints:-
1<=|S|<=50
*/

// Solution - 

public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
		 	String output;
        if(input.length() <= 1){
            return input;
        }
        String small = replace(input.substring(1));
        if(input.charAt(0)== 'p' && small.charAt(0)== 'i'){
            output = "3.14" + small.substring(1);
        }
        else{
            output = input.charAt(0) + small;
        }
        return output;
	}
}




/*
/////////////////////////
public class Recursion2{
    public static String replaceChar(String s,char a,char b){
        if(s.length()==0){
            return s;
        }
        String smallOutput=replaceChar(s.substring(1),a,b);
        if(s.charAt(0)==a){
            return b+smallOutput;
        }else{
            return s.charAt(0)+smallOutput;
        }
    }
    public static String replacePi(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            //Call recursion on string of length n-2;
            String smallOutput=replacePi(s.substring(2));
            return "3.14"+smallOutput;
        }else{
            //call recursion on string of length n-1;
            String smallOutput=replacePi(s.substring(1));
            return s.charAt(0)+smallOutput;
        }
    }
    public static void main(String[] args){
        //System.out.println(replaceChar("abcxdxex",'x','y'));
        System.out.println(replacePi("apiapipipiip"));
    }
}
//////////////////////

*/
