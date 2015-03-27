package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class WordsFromPhoneDigits {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("1", "");
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		map.put("*", "*");
		map.put("0", "0");
		map.put("#", "#");
		
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		String inp = scan.nextLine();
		
		Print(inp);

	}

	private static void Print(String inp) {
		
		
	}

}
