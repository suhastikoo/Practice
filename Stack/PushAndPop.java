package Stack;

public class PushAndPop {
	static int top = -1;
	static int[] size = new int[5];
	public static void main(String[] args) {		
		push(5);
		push(2);
		push(3);
		push(7);
		push(6);
		push(9);
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
	}

	private static void pop() {
		if(top>=0){
			System.out.println("Popped value is " + size[top--]);
		}
		else{
			System.out.println("Stack is empty");
		}
		
	}

	private static void push(int value) {
		if(top<size.length-1){
			size[++top] = value;
			System.out.println(value + " added");
		}
		else{
			System.out.println("Stack is full");
			return;
		}
		
	}

}
