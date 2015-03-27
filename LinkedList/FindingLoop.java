package LinkedList;
/*find a loop in a linked list*/

public class FindingLoop {
	static int flag = 0;
	static LinkedList root;
	public static void main(String[] args) {
		LinkedList[] obj = new LinkedList[8];
		for (int i=0; i<7; i++){
			obj[i] = new LinkedList();
		}

		obj[0].data=1;
		obj[0].next=obj[1];

		obj[1].data=2;
		obj[1].next=obj[2];

		obj[2].data=3;
		obj[2].next=obj[3];

		obj[3].data=4;
		obj[3].next=obj[4];

		obj[4].data=5;
		obj[4].next=obj[5];

		obj[5].data=6;
		obj[5].next=obj[6];

		obj[6].data=7;
		obj[6].next=obj[3];

		root = obj[0];
		LinkedList temp = FindLoop(root);
		if(temp != null){
			RemoveLoop(temp);
		}
		
		Print(root);

	}

	private static void Print(LinkedList root2) {
		System.out.print(root2.data + " ");
		while(root2.next != null){
			System.out.print(root2.next.data + " ");
			root2 = root2.next;
		}
		
	}

	private static void RemoveLoop(LinkedList temp) {
		LinkedList first = temp;
		LinkedList second = temp.next;
		int length = 1;
		while(first != second){
			second = second.next;
			length += 1;
		}		
		System.out.println("Lenght of loop: " + length);
		int count = 1;
		first = root;
		second = first;
		while(count<length){
			second = second.next;
			count += 1;
		}
		while(second.next != first){
			first = first.next;
			second = second.next;
		}
		
		second.next = null;
		System.out.println("Loop Removed");
	}

	private static LinkedList FindLoop(LinkedList obj) {
		LinkedList fast = obj.next.next;
		LinkedList slow = obj;
		
		while(slow.next!=null && fast.next != null){
			if(slow == fast){
				flag = 1;
				System.out.println("Loop found!!!");
				break;
			}
			else{
				if(fast.next.next!=null){
					slow = slow.next;
					fast = fast.next.next;
				}
				else{
					break;
				}
				
			}
		}
		
		if(flag==0){
			System.out.println("No loop present!!!");
			return null;
		}
		else{
			return slow;
		}
		
	}



}
