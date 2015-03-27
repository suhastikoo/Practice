package Strings;

public class LargestPalindromeSubstring {
	static int length,flag;
	static String temp;
	public static void main(String[] args) {
		String str = new String();
		str = "geeksforrofskeegabcdgehabba";
		
		if(str!=null && !str.isEmpty()){
			System.out.println("Lenght of input " + str.length());
			
			for(int i=0; i<str.length(); i++){
				for(int j=str.length()-1; j>=0; j--){
					if(str.charAt(i) == str.charAt(j)){
						int left = i;
						int right = j;
						while(left<=right){
							if(str.charAt(left) == str.charAt(right)){
								flag = 0;
								left++;
								right--;
							}
							else{
								flag = 1;
								break;
							}
						}
						if(flag == 0){
							int size = j-i+1;
							if(length<size){
								length = size;
								temp = str.substring(i, j+1);
							}
						}
					}
				}
			}
			
			System.out.println("Maximum lenght palindrome " + length);
			System.out.println("Palindrome: " + temp);
		}

	}

}
