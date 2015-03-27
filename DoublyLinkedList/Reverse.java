package DoublyLinkedList;

public class Reverse {
	static DLL root;
	public static void main(String[] args) {
		DLL[] obj = new DLL[6];
		for(int i=0; i<obj.length; i++){
			obj[i] = new DLL();
		}
		
		obj[0].data = 2;
		obj[0].next = obj[1];
		obj[0].prev = null;
		
		obj[1].data = 3;
		obj[1].next = obj[2];
		obj[1].prev = obj[0];
		
		obj[2].data = 4;
		obj[2].next = obj[3];
		obj[2].prev = obj[1];
		
		obj[3].data = 5;
		obj[3].next = obj[4];
		obj[3].prev = obj[2];
		
		obj[4].data = 6;
		obj[4].next = obj[5];
		obj[4].prev = obj[3];
		
		obj[5].data = 7;
		obj[5].next = null;
		obj[5].prev = obj[4];
		
		root = obj[0];
		Print(root);
		ReverseDLL(root);
		System.out.println();
		Print(root);
	}
	
	private static void ReverseDLL(DLL obj) {
		DLL prev = obj;
		DLL curr = obj.next;
		DLL temp = obj;
		prev.next = null;
		prev.prev = curr;
		while(curr.next != null){
			temp = curr;
			curr = curr.next;
			temp.next = prev;
			temp.prev = curr;
			prev = temp;
		}
		curr.next = prev;
		curr.prev = null;
		root = curr;
	}

	private static void Print(DLL obj) {
		System.out.print(obj.data + " ");
		while(obj.next!=null){
			System.out.print(obj.next.data + " ");
			obj = obj.next;
		}		
	}

}
