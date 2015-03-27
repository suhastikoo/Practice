package Strings;

public class AlphanumericToSumUsingPointers {

	public static void main(String[] args) {
		
//		char a = '1';
//		int ans  = Character.getNumericValue(a);
//		System.out.println(ans);
		
		String str = new String();
		str = "A12B3C45";
		
		int temp = 0;
		int sum = 0;
		
		for(int i=0; i<str.length(); i++){
			int curr = Character.getNumericValue(str.charAt(i));
			if(curr<10){
				//digit
				temp = temp*10 + curr;
			}
			else{
				sum += temp;
				temp=0;
			}
		}
		
		sum += temp;
		
		System.out.println("Sum is " + sum);

	}

}
