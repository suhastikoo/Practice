package DoublyLinkedList;

public class AddBeforeGivenNode {
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
		System.out.println();
		int value = 8;
		AddBeforeNode(obj[1],value);
		Print(root);


	}
	
	private static void AddBeforeNode(DLL dll, int value) {
		DLL temp = new DLL();
		temp.data = value;
		if(dll.prev!=null){
			DLL temp1 = dll.prev;
			dll.prev = temp;
			temp.next = dll;
			temp.prev = temp1;
			temp1.next = temp;
		}
		else{
			dll.prev = temp;
			temp.next = dll;
			temp.prev = null;
			root = temp;
		}
		
	}

	private static void Print(DLL obj) {
		System.out.print(obj.data + " ");
		while(obj.next!=null){
			System.out.print(obj.next.data + " ");
			obj = obj.next;
		}		
	}

}
