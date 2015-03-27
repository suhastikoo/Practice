package BinarySearchTree;

public class SortedLinkedListToBST {

	public static void main(String[] args) {
		LL[] obj = new LL[7];
		for (int i=0; i<7; i++){
			obj[i] = new LL();
		}
		
		obj[0].data = 1;
		obj[0].next = obj[1];		
		obj[1].data = 2;
		obj[1].next = obj[2];
		obj[2].data = 3;
		obj[2].next = obj[3];
		obj[3].data = 4;
		obj[3].next = obj[4];
		obj[4].data = 5;
		obj[4].next = obj[5];
		obj[5].data = 6;
		obj[5].next = obj[6];
		obj[6].data = 7;
		obj[6].next = null;
		
		PrintLL(obj[0]);
		
		MakeTree(obj[0]);

	}

	private static void MakeTree(LL ll) {
		LL temp = ll;
		BST[] obj = new BST[7];
		for(int i=0; i<7; i++){
			obj[i] = new BST();
		}
		
		int count = 0;
		int len = 1;
		while(len<=Math.ceil(7/2)){
			ll = ll.next;
			len++;
		}
		BST head;
		obj[count++].data = temp.data;
		while(temp.next.data!=ll.data){
			
		}
	}

	private static void PrintLL(LL ll) {
		System.out.print(ll.data);
		while(ll.next!=null){
			System.out.print(" --> " + ll.next.data);
			ll = ll.next;
		}
		
	}

}

class LL{
	LL next;
	int data;
}
