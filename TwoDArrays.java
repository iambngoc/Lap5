package Lap5;

public class TwoDArrays {
	//Task 1.1
	public static int[][] add(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length)
			return null;
		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	//Task 1.2
	public static int[][]subtract(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length)
			return null;
		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] =a[i][j] - b[i][j];
			}
		}
		return c;
	}
	//Task 1.3
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}  
			}
		}
		return c;
	}
	//Task 1.4
	public static int[][] transpose(int[][] a) {
		int[][] b = new int[a[0].length][a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j]=a[j][i];
			}
		}
		return b;
	}
	//print matrix
	public static void printMatrix(int M[][]) {
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++)
				System.out.print(M[i][j] + " ");
				System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[][] = {{ 1, 3, 1},
					 { 2, 2, 3},
					 { 3, 3, 3}};
		
		int b[][] = {{ 1, 1, 1 },
					 { 1, 1, 1 },
					 { 1, 1, 1 }};
		
		printMatrix(add(a, b));
		printMatrix(subtract(a, b));
		printMatrix(multiply(a, b));
		printMatrix(transpose(a));
	}
}
