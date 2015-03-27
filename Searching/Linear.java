package Searching;

public class Linear {

	public static void main(String[] args) {
		int[] array = {5,4,9,7,25,6,8};
		
		int value = 8;
		int count = 0;
		for(int a : array){
			if(a==value){
				System.out.println("Found at " + ++count);
				break;
			}
			else{
				count++;
			}
		}

	}

}
