package Stack;

public class SumOfTwoNumbers {
	static int top = -1;
	static int[] data = new int[5];
	public static void main(String[] args) {
//		char a = '+';
//		int b = a;
//		char c = (char) b;
//		System.out.println(c);
		String exp = "A12B3C45";
		int temp = 0;
		int sum = 0;
		int sum_stack = 0;
		
		for(int i=0; i<exp.length(); i++){
			int curr = Character.getNumericValue(exp.charAt(i));
			if(curr<10){
				//digit
				temp = temp*10 + curr;
			}
			else{
				if(temp!=0){
					push(temp);
					sum += temp;
					temp = 0;
				}
			}
		}
		if(temp!=0){
			push(temp);
			sum += temp;
			temp = 0;
		}
		
		for(int i=top; i>=0; i--){
			sum_stack += pop();
		}
		
		System.out.println("Sum is " + sum);
		System.out.println("Sum using stack " + sum_stack);
	}
	private static void push(int val) {
		if(top<data.length-1){
			data[++top] = val;
		}
		else{
			System.out.println("Stack is full");
		}		
	}
	
	public static int pop(){
		if(top>=0){
			return data[top--];
		}
		return 0;
	}
}

