package recursion;

public class checkSorted {
	
	
	static boolean checkSorted(int input[]) {
		if(input.length <= 1) {
			return true;
		}
		
		int smlArr[] = new int[input.length-1];
		for(int i=1; i<input.length; i++) {
//			input[i-1] = smlArr[i];
			smlArr[i-1] = input[i];
		}
		
		boolean smallAns = checkSorted(smlArr);
		if(!smallAns) {
			return false;
		}
		
		if(input[0]<=input[1]) {
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	static boolean checkSorted2(int arr[]) {
		if(arr.length <= 1) {
			return true;
		}
		
		if(arr[0]>arr[1]) {
			return false;
		}
		
		int smlArr[] = new int[arr.length-1];
		for(int i=1; i<arr.length; i++) {
			smlArr[i-1] = arr[i];
		}
		
		boolean smallAns = checkSorted(smlArr);
		if(!smallAns) {
			return false;
		}
		else {
			return true;
		}		
	}
	

	
	public static void main(String[] args) {
			int arr[] = {2,4,1,6,9,5};
			System.out.println(checkSorted2(arr));
	}
}
