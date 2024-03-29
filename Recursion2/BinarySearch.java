/*
Binary Search (Recursive)

Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)

Sample Input :
6
2 3 4 5 6 8 
5 
Sample Output:
3 
*/

// public class solution {
	// // element - number to be searched
	// public static int binarySearch(int input[], int element) {
	//	// Write your code here
	// }
// }

public class solution {
	// element - number to be searched
	private static int search(int arr[], int start, int end, int target){
    
        int mid = (start+end)/2;    
        
        if (start>=end){
            return -1;
        }
        
        if(target ==arr[mid]){
            return mid;
        }
        
        else if (target<arr[mid]){
            return search(arr,start, mid-1,target);
        }
        else{
            return search(arr,mid+1,end, target);
        }
    }
    public static int binarySearch(int input[], int element) {
		// Write your code here
        
        int len = input.length;
        int end = len-1;
        int start = 0;
        
        return search(input, start, end, element);
    }  
}
