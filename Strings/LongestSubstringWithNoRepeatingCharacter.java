package Strings;

import java.util.HashSet;

public class LongestSubstringWithNoRepeatingCharacter {

	public static void main(String[] args) {
		String str = new String();
		str = "abcabcdefghijklauvwxyzs jkd";
		
		if(str!=null && !str.isEmpty()){
			HashSet<Character> set = new HashSet<Character>();
			
			char[] array = str.toLowerCase().replaceAll(" ", "").toCharArray();
			int start=0,temp=0,end=0,length=0;
			for(int i=0; i<array.length; i++){
				if(!set.contains(array[i])){
					set.add(array[i]);
				}
				else{
					if(length<i-temp){
						end = i-1;
						start = temp;
						length = end - start + 1;
						temp = i;
						set.clear();
					}
				}
			}
			
			String out = str.substring(start, end);
			System.out.println("Longest substring: " + out);
		}
		else{
			System.out.println("Invalid String.");
		}

	}

}
