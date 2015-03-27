package Stack;

public class ReverseAString {
	static int top = -1;
	public static void main(String[] args) {		
		String str = "Suhas Tikoo ";
		if(str==null){
			System.out.println("got it");
		}
		else{
			System.out.println("Input: " + str);
			char[] output = str.toCharArray();
			char[] size = new char[str.length()];
			
			for(int i=0; i<str.length(); i++){
				push(str.charAt(i),size);
			}
			//String output = "";
			for(int i=0; i<str.length(); i++){
				output[i] = pop(size);
			}
			String a = new String(output);
			System.out.println("Output: " + a);
			
		}
		
	}
	
	private static char pop(char[] size) {
		if(top>=0){
			return size[top--];
			
		}
		else{
			return 0;
		}		
	}

	private static void push(char value, char[] size) {
		if(top<size.length-1){
			size[++top] = value;
		}
		else{
			return;
		}		
	}
}
