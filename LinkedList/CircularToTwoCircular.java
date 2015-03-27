package LinkedList;

public class CircularToTwoCircular {

	static LinkedList root, root2;
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
		obj[6].next=obj[0];
		
		Split(obj[0]);
		
		Print(root);
		Print(root2);

	}

	private static void Print(LinkedList obj) {
		LinkedList temp = obj;
		System.out.print(obj.data);
		while(obj.next!=temp){
			System.out.print(" --> " + obj.next.data);
			obj = obj.next;
		}
		System.out.println();
		
	}

	private static void Split(LinkedList obj) {
		root = obj;
		root2 = obj;
		LinkedList mid = obj;
		int length = 1;
		float middle = 1;
		
		while(obj.next!=root){
			obj = obj.next;
			length++;
			if(middle<Math.ceil(length/2)){
				middle++;
				mid = mid.next;
			}
		}
		root2 = mid.next;
		obj.next = root2;
		mid.next = root;
		
		
	}

}
