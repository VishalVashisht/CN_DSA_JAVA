import java.util.Scanner;

public class InsertRecursive {

	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
//				Node<Integer> temp = head;
//				while(temp.next != null) {
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = tail.next; // tail = newNode (alter)
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head; 
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp= temp.next;
		}
	}
	
	
	public static Node<Integer> insertRecursive(Node<Integer> head, int pos, int elem){
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}
		
		head.next = insertRecursive(head.next, pos-1, elem);
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = insertRecursive(head,2,10);
		print(head);

	}

}
