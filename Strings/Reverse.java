package Strings;
/*Reverse a string. */

public class Reverse {

	public static void main(String[] args) {
		String input = "Suhas  t   - ";
		System.out.println(input);
		
		if(input != null && !input.isEmpty()){
			/*Using char array*/
			char[] inp = input.toCharArray();
			int size = inp.length - 1;
			for (int i=0; i<inp.length/2; i++){
				char temp = inp[i];
				inp[i] = inp[size-i];
				inp[size-i] = temp;
			}
			String out = new String(inp);
			System.out.println(out);
			
			/*Using String Buffer*/
//			StringBuffer obj = new StringBuffer(input);
//			String out = obj.reverse().toString();
//			
//			
//			System.out.println(out);
		}
		else{
			System.out.println("Invalid input");
		}
		

	}

}
