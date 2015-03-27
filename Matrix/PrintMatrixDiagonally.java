package Matrix;

public class PrintMatrixDiagonally {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		
		Print(matrix);

	}

	private static void Print(int[][] matrix) {
		//int count = 0;
		
		for(int i=0; i<matrix.length; i++){
			int j = 0;
			while(j <= i && j<matrix[0].length){
				System.out.print(matrix[i-j][j] + " ");
				j++;
			}
			System.out.println();			
		}
		
		int row = matrix.length;
		for(int z=1; z<matrix[0].length; z++){
			int i = z;
			while(i<matrix[0].length){
				System.out.print(matrix[row-i][i] + " ");
				i++;
			}
		}
		
		
		
	}

}
