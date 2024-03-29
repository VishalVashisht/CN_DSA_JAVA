/*
Reverse String Wordwise

Reverse the given string word wise. That is, the last word in given string should come at 1st place,
last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always

*/



// Solution - 

public class Solution {
	public static String reverseWordWise(String input) {
		int end = input.length() - 1,start,j;
		String result ="",word = "";
		for(int i= input.length() - 1;i >= 0;i--) {
			if(input.charAt(i) == ' ') {
				start = i + 1;
				word = "";
				for(j = start;j <= end;j++) {
					word += input.charAt(j);
				}
				end  = i - 1;
				result = result + word + " ";
			}
		}
		word = "";
		for(j = 0;j <= end;j++) {
			word = word + input.charAt(j);
		}
		result += word;
		return result;
	}
}




/*
public class ReverseEachWord {

      public static String reverseEachWord(String str){
          String ans="";
          int currentWordStart=0;
          int i=0;
          for(;i<str.length();i++){
              if(str.charAt(i)==' '){
                  //Reverse Current Word
                  int currentWordEnd=i-1;
                  String reversedWord="";
                  for(int j=currentWordStart;j<=currentWordEnd;j++){
                      reversedWord=str.charAt(j)+reversedWord;
                  }
                  //Add it final String(ans)
                  ans+=reversedWord+" ";
                  currentWordStart=i+1;
              }
          }
          int currentWordEnd=i-1;
          String reversedWord="";
          for(int j=currentWordStart;j<=currentWordEnd;j++){
              reversedWord=str.charAt(j)+reversedWord;
          }
          ans+=reversedWord;
          return ans;
      }
    
    public static void main(String args[]) {
        String str="abc def ghi jkl";
        System.out.println(reverseEachWord(str));
}  
}

*/
