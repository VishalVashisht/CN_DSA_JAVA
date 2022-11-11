/*
Merge Sort Code

Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/

// Solution - 

public class solution {
	public static void mergeSort(int[] input){
		// Write your code here
		if(input.length <=1){
            return;
	}
        
    int mid = input.length / 2;
        int part1[] = new int[mid];
        int part2[] = new int[input.length - mid];
        for(int i=0; i<mid;i++){
            part1[i] = input[i];
        }
        int k=0;
        for(int i=mid;i<input.length;i++){
            part2[k] = input[i];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(part1, part2, input);
	}
    public static void merge(int[] input1, int input2[], int[] output){
        int i=0, j=0, k=0;
        while(i < input1.length && j < input2.length){
            if(input1[i] < input2[j]){
                output[k] = input1[i];
                k++;
                i++;
            }
            else{
                output[k] = input2[j];
                j++;
                k++;
            }
        }
        while(i < input1.length){
            output[k] = input1[i];
            k++;
            i++;
        }
        while(j < input2.length){
            output[k] = input2[j];
            j++;
            k++;
            
        }
    }
}

////////////////////
// Other Appraoch --

/*
Java program for Merge Sort 
class MergeSort {
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays 
		int L[] = new int[n1];
		int R[] = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Merge the temp arrays 

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any 
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any 
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	// A utility function to print array of size n 
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}
*/
