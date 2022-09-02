/*
Total Sum on the Boundaries and Diagonals

For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
Input format:
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'N' column values separated by a single space.
Output format:
For each test case, print the single integer denoting the sum.

Output for every test case will be printed in a seperate line.
Constraints:
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1sec
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

The first-diagonal elements are 1, 5 and 9. 

The second-diagonal elements are 3, 5 and 7.

We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, 
'5' contributes to both the diagonals but they won't be added twice.

Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
Sample input 2:
2
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
4
1 2 3 10
4 5 6 11
7 8 9 12
13 14 15 16
Sample Output 2:
273
136
*/

// Solution - 


public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        
        if(mat.length == 0){
            System.out.println("0");
            return;

        }
            
            
        int bSum = b_sum(mat);
        int dSum = d_sum(mat);
        
        // System.out.println(bSum);
        // System.out.println(dSum);

        System.out.println(bSum+dSum);
	}
	
    public static int b_sum(int mat[][]){
        int sum = 0;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i==0 || j==0 || i==mat.length-1 || j==mat[0].length-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    
    public static int d_sum(int[][] mat){
        int sum =0;
        // int r = mat.length;
        // int c = mat[0].length;
        int n = mat.length-1;
        for(int i=0; i<=n; i++){
        	for(int j=0; j<=n; j++){
           		
                if(i==j){
                	sum += mat[i][j];
            	}
                
                if(i+j == n && i != j){
                    sum+=mat[i][j];
                }
        	}
    	}
        return sum-mat[0][0]-mat[n][n]-mat[0][n]-mat[n][0];
    }  
}


// OR

/*
public class Solution {

	public static void totalSum(int[][] matrix) {
		//Your code goes here
        int rs = 0;
		int re = matrix.length - 1;
		int cs = 0;
		int ce = matrix[0].length - 1;
		int i,j,c = 1;
		if((re + 1) ==1) {
			for(j = cs;j <= ce;j++ ) {
				System.out.print(matrix[rs][j] + " ");
			}
		}
		else if((ce + 1) ==1) {
			for(i = rs;i <= re;i++) {
				System.out.print(matrix[i][cs] + " ");	
			}
		}
		else {
		while(c <= (matrix.length*matrix[0].length)) {
			for(j = cs;j <= ce;j++) {
				System.out.print(matrix[rs][j] + " ");
				c++;
			}
			rs++;
			for(i = rs;i <= re;i++) {
				System.out.print(matrix[i][ce] + " ");
				c++;
			}
			ce--;
			for(j = ce ;j >= cs ;j--) {
				System.out.print(matrix[re][j] + " ");
				c++;
			}
			re--;
			for(i = re;i >= rs;i--) {
				System.out.print(matrix[i][cs] + " ");
				c++;
			}
			cs++;
		}
		}
	}
}
*/
