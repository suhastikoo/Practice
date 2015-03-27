package Stack;

public class FindMaximumAtAllTimes {
	static int top = -1;
	static int[] data = new int[5];
	static int[] max = new int[5];
	static int maximum;
	public static void main(String[] args) {
		push(1);
		push(-4);
		push(8);
		push(2);
		push(10);
		push(5);
		push(3);
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();

	}
	
	public static void push(int value){
		if(top<data.length-1){
			if(top==-1){
				maximum = value;
				++top;
				data[top] = value;
				max[top] = maximum;
				System.out.println(value + " added");
				System.out.println("Maximum is " + max[top]);
			}
			else{
				++top;
				data[top] = value;
				if(maximum>value){
					max[top] = maximum;
				}
				else{
					maximum = value;
					max[top] = value;
				}
				System.out.println(value + " added");
				System.out.println("Maximum is " + max[top]);
			}			
		}
		else{
			System.out.println("Stack is full");
		}
	}
	
	public static void pop(){
		if(top>0){
			System.out.println("Number popped " + data[top]);
			System.out.println("Old Maximum " + max[top]);
			top--;
			System.out.println("New Maximum " + max[top]);
		}
		else if(top == 0){
			System.out.println("Number popped " + data[top]);
			System.out.println("Old Maximum " + max[top]);
			top--;
			System.out.println("No new maximum");
		}
		else{
			System.out.println("Stack is empty!");
		}
	}

}
