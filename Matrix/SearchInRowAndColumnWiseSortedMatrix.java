package Matrix;

public class SearchInRowAndColumnWiseSortedMatrix {

	public static void main(String[] args) {

		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		
		int value = 32;
		Find(matrix,value);
	}

	public static void Find(int[][] matrix, int value){
		int row = 0;
		int col = matrix.length - 1;
		int flag = 0;
		int count = 0;
		
		while(flag==0 && row<matrix.length && col>=0){
			if(matrix[row][col] == value){
				System.out.println(value + " found at index " + row + " " + col);
				flag = 1;
			}
			else if(matrix[row][col] > value){
				col = col - 1;
				count++;
			}
			else if(matrix[row][col] < value){
				row = row + 1;
				count++;
			}
		}		
		if(flag==0){
			System.out.println(value + " is not present in matrix.");
		}
		else{
			System.out.println("Number of iterations: " + count);
		}
		
	}
}
