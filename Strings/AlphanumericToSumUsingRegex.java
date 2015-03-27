package Strings;

public class AlphanumericToSumUsingRegex {

	public static void main(String[] args) {

		String str = new String();
		str = "A12B3C45 6";
	
		String[] inp = str.split("[A-Za-z ]");
		int sum = 0;
		for(String a : inp){
			if(!a.isEmpty()){
				sum += Integer.parseInt(a);
			}
		}

		System.out.println("Sum is " + sum);

	}

}
