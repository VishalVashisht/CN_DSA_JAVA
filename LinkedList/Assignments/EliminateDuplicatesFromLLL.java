/*
Eliminate duplicates from LL

You have been given a singly linked list of integers where the elements are sorted in ascending order. Write a function that removes the consecutive duplicate values
such that the given list only contains unique elements and returns the head to the updated list.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements(in ascending order) of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 Output format :
For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
1 2 3 3 3 3 4 4 4 5 5 7 -1
Sample Output 1 :
1 2 3 4 5 7 
Sample Input 2 :
2
10 20 30 40 50 -1
10 10 10 10 -1
Sample Output 2 :
10 20 30 40 50
10
*/

/// Take care of the corner case 1-1-2-2-2-2-Null


/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		 if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> uniqueNode=head.next,node=head;
            
            while (uniqueNode!=null)
            {
                //System.out.println("Current uniqueNode data: " + uniqueNode.data);
                //System.out.println("Current node data: "+ node.data);
                if (!(uniqueNode.data).equals(node.data))
                {
                    //System.out.println("Adding uniqueNode to the updated linkedlist");
                    node.next=uniqueNode;
                    node=node.next;
                    //Runner.print(head);
                }
                uniqueNode=uniqueNode.next;
                //System.out.println();
            }
            node.next=uniqueNode;
            
            /*LinkedListNode<Integer> node=head;
        	while(node.next!=null)
        	{	
            	if(node.data==node.next.data)
            	{
                	node.next=node.next.next;
            	}
            	else
                {
            		node=node.next;          
            	}
        	}*/
        
        	return head; 
	}

}
