package Strings;

public class CheckForPalindrome {

	public static void main(String[] args) {
		String str = new String();
		str = "ab ab c";
		
//		if("".equals(str)){
		if(str!=null && !str.isEmpty()){
			str = str.replaceAll(" ", "");
			StringBuffer str1 = new StringBuffer(str);
			if(str1.reverse().toString().equals(str)){
				System.out.println("Palindrome");
			}
			else{
				System.out.println("Not a palindrome");
			}
		}
		else{
			System.out.println("Invalid String");
		}

	}

}
