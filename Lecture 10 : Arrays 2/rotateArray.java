/*
Rotate array

You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains the value of 'D' by which the array/list needs to be rotated.
Output Format :
For each test case, print the rotated array/list in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^4
0 <= N <= 10^6
0 <= D <= N
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2
*/

// Solution - 

import java.util.Scanner;
public class rotateArray{
	
	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	
//	public static void rotateArray(int[] arr, int d) {
//		// here in problem in some test cases which are showing "time limit exceeds".
//        for(int i=0; i<d; i++){
//            int swap = arr[0];
//            for(int j=1; j<arr.length; j++){
//                arr[j-1] = arr[j];
//            }
//            arr[arr.length-1] = swap;
//        }
//    }
	
	
	public static void rotateArray(int arr[], int d) {
		int d_arr[] = new int[d];
		for(int i=0; i<d; i++) {
			d_arr[i] = arr[i];
			
		}
		print(d_arr);
		System.out.println();
	
		for(int i=0; i<arr.length-d; i++) {
			arr[i] = arr[i+d];
		}
		
		print(arr);
		System.out.println();
		
		int x=0;
		for(int i=arr.length-d; i<arr.length; i++) {
			arr[i] = d_arr[x];
			x++;
		}
	}
	
	
	
	public static void print(int arr[]) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		  
		System.out.print("Enter the number of iterations : ");
		int t = sc.nextInt();
		 
		while(t>0) {
			int arr[] = inputArray();
			System.out.println();
			System.out.print("How many numbers are to be shifted to left : ");
			int d= sc.nextInt();
			rotateArray(arr,d);
			
			print(arr);
			
			t--;
		}
		 
	}

}
