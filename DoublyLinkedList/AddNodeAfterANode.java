package DoublyLinkedList;

public class AddNodeAfterANode {

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
		
		Print(obj[0]);
		System.out.println();
		int value = 8;
		AddAfterGivenNode(obj[0],value);
		Print(obj[0]);

	}
	
	private static void AddAfterGivenNode(DLL obj, int value) {
		DLL temp = new DLL();
		temp.data = value;
		if(obj.next!=null){
			DLL temp1 = obj.next;
			obj.next = temp;
			temp.prev = obj;
			temp.next = temp1;
			temp.prev = temp;
		}
		else{
			obj.next = temp;
			temp.next = null;
			temp.prev = obj;
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
