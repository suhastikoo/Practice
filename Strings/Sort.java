package Strings;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		String inp = "HELLO WORLD";
		char[] temp = inp.toCharArray();
		
		Arrays.sort(temp);
		
		String out = new String(temp);
		
		System.out.println(out);
	}

}
