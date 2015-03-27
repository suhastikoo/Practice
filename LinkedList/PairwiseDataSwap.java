package LinkedList;

public class PairwiseDataSwap {
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
		obj[6].next=null;

		
		root = obj[0];
		Print(root);
		DataSwap(root);
		Print(root);
	}
	private static void Print(LinkedList obj) {
		System.out.print(obj.data);
		while(obj.next!=null){
			System.out.print(" --> " + obj.next.data);
			obj = obj.next;
		}
		System.out.println();
		
	}
	private static void DataSwap(LinkedList obj) {
		LinkedList prev = obj;
		LinkedList next = obj.next;		
		
		while(next.next != null){
			int temp = prev.data;
			prev.data = next.data;
			next.data = temp;
			if(next.next.next != null){				
				prev = next.next;
				next = prev.next;
			}
			else{
				break;
			}
			
		}
		
	}

}
