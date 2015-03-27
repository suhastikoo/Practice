package LinkedList;

public class Palindrome {

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
		
		obj[4].data=3;
		obj[4].next=obj[5];
		
		obj[5].data=2;
		obj[5].next=obj[6];
		
		obj[6].data=1;
		obj[6].next=null;
		
		String val = ConvertToString(obj[0]);	
		String rev = Reverse(obj[0]);
		System.out.println(val + " " + rev);
		if (val.equals(rev)){
			System.out.println("This is a Palindrome.");
		}
		else{
			System.out.println("Not a Palindrome.");
		}

	}

	private static String ConvertToString(LinkedList obj) {
		String val = Integer.toString(obj.data);
		while(obj.next!=null){
			val = val.concat(Integer.toString(obj.next.data));
			obj = obj.next;
		}
		
		return val;
	}
	
	private static String Reverse(LinkedList obj) {
		LinkedList current = obj.next;
		LinkedList prev = obj;
		LinkedList temp = obj;
		
		obj.next = null;
		while(current.next != null){
			prev = current;
			current = current.next;
			prev.next = temp;
			temp = prev;
		}
		current.next = prev;
		
		return ConvertToString(current);		
	}

}
