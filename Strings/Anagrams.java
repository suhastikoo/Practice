package Strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String str1 = new String();
		str1 = "cat";
		String str2 = new String();
		str2 = "Act3";

		if(str1!=null && !str1.isEmpty() && str2!=null && !str2.isEmpty()){
			if(str1.length()!=str2.length()){
				System.out.println("Not anagrams!!");
			}
			else{
				char[] temp1 = str1.toLowerCase().toCharArray();
				char[] temp2 = str2.toLowerCase().toCharArray();

				Arrays.sort(temp1);
				Arrays.sort(temp2);

				if(String.valueOf(temp1).equals(String.valueOf(temp2))){
					System.out.println("Anagrams");
				}
				else{
					System.out.println("Not anagrams");
				}
			}
		}
		else{
			System.out.println("Invalid String");
		}



	}

}
