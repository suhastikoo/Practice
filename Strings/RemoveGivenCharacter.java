package Strings;

public class RemoveGivenCharacter {

	public static void main(String[] args) {
		String str = new String();
		str = "abcdce";
		char rem = 'c';
		
		if(str != null && !"".equals(str)){
			StringBuffer str1 = new StringBuffer();
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i) != rem){
					str1.append(str.charAt(i));
				}
			}
			System.out.println(str1.toString());
		}
		else{
			System.out.println("Invalid String!!!");
		}

	}

}
