package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class TextProcessingString {

	public static void main(String[] args) {
		String obj = new String();
		obj = "AMAZON";
		
		if(obj!=null && !obj.isEmpty()){
			char[] val = obj.toCharArray();
			
			LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
			
			for(char a : val){
				if(map.containsKey(a)){
					int temp = map.get(a);
					map.put(a, temp+1);
				}
				else{
					map.put(a, 1);
				}				
			}
			
			int i = 0;
			val = new char[map.size()*2];
			for(Map.Entry<Character,Integer> entry : map.entrySet()){
				val[i] = (entry.getKey());
				i++;
				int temp = entry.getValue();
				val[i++] = (char)temp;
			}
			
			String out = new String(val);
			System.out.println(out);
		}
		else{
			System.out.println("Invalid String!!!");
		}

	}

}
