package Matrix;

public class PrintMatrixInSpiralForm {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		PrintSpiral(matrix);

	}

	private static void PrintSpiral(int[][] matrix) {
		int row = 0;
		int col = 0;
		int flag = 0;
		
		while(flag==0){
			System.out.print(matrix[row][col] + " ");
			col++;
		}
		
	}

}
