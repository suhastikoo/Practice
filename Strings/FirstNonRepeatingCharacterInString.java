package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		String obj = new String();
		obj = "geekforgeek";
		if(obj!=null && !obj.isEmpty()){

			System.out.println("Input string: " + obj);

			LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();

			char[] array = obj.replaceAll(" ", "").toLowerCase().toCharArray();
			for(char a : array){
				if(map.containsKey(a)){					
					int temp = map.get(a);
					map.remove(a);
					map.put(a,temp+1);

				}
				else{
					map.put(a,1);
				}
			}

			//			for(char b : set){
			//				System.out.println(b);
			//			}

			//			Iterator<Character> itr = map.iterator();
			for(Map.Entry<Character, Integer> entry : map.entrySet()){
				if(entry.getValue()>1){
					System.out.println("No unique character present!!!");
					break;
				}
				else{
					System.out.println("First non repeating character: " + entry.getKey());
					break;
				}


			}

		}
		else{
			System.out.println("Invalid String.");
		}

	}

}
