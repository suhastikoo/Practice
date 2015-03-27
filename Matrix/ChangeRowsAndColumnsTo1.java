package Matrix;

import java.util.ArrayList;

public class ChangeRowsAndColumnsTo1 {

	public static void main(String[] args) {
		//int[][] matrix = {{0,0,0},{0,0,1}};
		
		int[][] matrix = {{1,0,0,1},{0,0,1,0},{0,0,0,0}};
		
		//System.out.println(matrix.length + " " + matrix[1].length);
		Print(matrix);
		System.out.println();
		ChangeMatrix(matrix);
		Print(matrix);

	}

	private static void Print(int[][] matrix) {
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static void ChangeMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] == 1){
					list.add(i);
					list.add(j);
				}
			}
		}
		
		for(int i=0; i<list.size()-1;){
			for(int j=0; j<matrix[0].length; j++){
				matrix[list.get(i)][j] = 1;
			}
			i = i+2;
		}
		
		for(int j=1; j<list.size();){
			for(int i=0; i<matrix.length; i++){
				matrix[i][list.get(j)] = 1;
			}
			j = j+2;
		}
	}

}
