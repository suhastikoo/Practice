
import java.util.Arrays;
import java.util.Scanner;


public class NextLargestNumberWithSameDigits {
	static int loc = 0, flag = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");
		String value = scan.nextLine();
		char[] val = value.toCharArray();

		int i=val.length-1;
		
		while(i>0 && flag == 0){
			for(int j=i-1; j>=0; j--){
				if(val[i]>val[j]){
					char temp = val[i];
					val[i] = val[j];
					val[j] = temp;
					loc = j+1;					
					flag = 1;
					break;
				}
			}
			i--;
		}		
		if(flag == 1){
			Arrays.sort(val,loc,val.length);
		}
		

		String out = new String(val);
		System.out.println(out);
		scan.close();

	}

}
