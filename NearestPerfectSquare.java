
public class NearestPerfectSquare {

	public static void main(String[] args) {
		int value = 6;
		
		if(value<=0){
			System.out.println("Nearest perfect square is 1");
		}
		else{
			int temp = (int) Math.ceil(Math.sqrt(value));
			System.out.println("Nearest perfect square is " + temp*temp);
		}

	}

}
