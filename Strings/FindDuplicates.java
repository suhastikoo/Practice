package Strings;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
//		char test = 'a';
//		int ans = (Character.toLowerCase(test));
//		//int ans = Character.getNumericValue(Character.toLowerCase(test));
//		System.out.println(ans);
		
		
		
		String inp = new String();
		inp = "suhas tikoo";
		
		if(inp != null && !inp.isEmpty()){
			HashSet<Integer> map = new HashSet<Integer>();
			for(int i=0; i<inp.length(); i++){
				int val = Character.toLowerCase(inp.charAt(i));
				if(!map.contains(val)){
					map.add(val);
				}
				else{
					System.out.println("Character " + inp.charAt(i) + " is a duplicate");
				}
			}			
		}
		else{
			System.out.println("String is a null");
		}

	}

}
