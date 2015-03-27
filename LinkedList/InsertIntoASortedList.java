package LinkedList;

public class InsertIntoASortedList {
	static LinkedList root;
	static int flag;
	public static void main(String[] args) {
		LinkedList[] obj = new LinkedList[8];
		for (int i=0; i<7; i++){
			obj[i] = new LinkedList();
		}

		obj[0].data=2;
		obj[0].next=obj[1];

		obj[1].data=4;
		obj[1].next=obj[2];

		obj[2].data=6;
		obj[2].next=obj[3];

		obj[3].data=8;
		obj[3].next=obj[4];

		obj[4].data=10;
		obj[4].next=obj[5];

		obj[5].data=12;
		obj[5].next=obj[6];

		obj[6].data=14;
		obj[6].next=null;
		
		root = obj[0];
		int value = 5;
		
		Print(root);
		Insert(root,value);
		System.out.println();
		Print(root);
	}
	
	private static void Insert(LinkedList obj, int value) {
		LinkedList temp = new LinkedList();
		temp.data = value;
		if(obj.data>value){
			temp.next = obj;
			root = temp;
		}
		else{
			while(obj.next!=null){
				LinkedList prev = obj;
				LinkedList next = obj.next;
				if(prev.data<value && next.data>=value){
					prev.next = temp;
					temp.next = next;
					flag = 1;
					break;
				}
				else{
					obj = obj.next;
				}
			}
			if(flag == 0){
				obj.next = temp;
				temp.next = null;
			}
		}
		
	}
	
	private static void Print(LinkedList obj) {
		System.out.print(obj.data + " ");
		while(obj.next != null){
			System.out.print(obj.next.data + " ");
			obj = obj.next;
		}
		
	}

}
