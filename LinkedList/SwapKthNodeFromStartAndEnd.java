package LinkedList;

public class SwapKthNodeFromStartAndEnd {
	static LinkedList root;
	static int pos;
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
		obj[6].next=null;

		pos = 3;
		root = obj[0];
		Print(root);
		Swap(root);
		Print(root);
	}
	private static void Swap(LinkedList obj) {
		LinkedList first;
		LinkedList second = obj;
		LinkedList end = obj;
		int count = 1;
		
		while(count<pos){
			end = end.next;
			count++;
		}
		first = end;
		while(end.next!=null){
			end = end.next;
			second = second.next;
		}
		int temp = first.data;
		first.data = second.data;
		second.data = temp;
	}
	private static void Print(LinkedList obj) {
		System.out.print(obj.data);
		while(obj.next!=null){
			System.out.print(" --> " + obj.next.data);
			obj = obj.next;
		}
		System.out.println();
		
	}

}
