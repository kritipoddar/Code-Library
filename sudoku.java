import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int h=0; h<t; h++)
		{
		    int m[][]=new int[9][9];
		    for(int i=0; i<9; i++)
		    {
		        for(int j=0; j<9; j++)
		        {
		            m[i][j]=sc.nextInt();
		        }
		    }
		    if(solveSudoku(m, 0, 0))
		        PrintSolution(m);
		}
	}
		public static boolean solveSudoku(int[][] mat, int row, int column){
		
		if(row==9){
			row=0;
			if(++column==9){
			    //Final termination Condition if solution found
				return true;
			}
		}
		
		//Returning if it is pre-filled
		if(mat[row][column]!=0){
			return solveSudoku(mat,row+1, column );
		}
		for(int value = 1; value<=9; value++){
			if(isLegal(mat,row,column,value)){
				mat[row][column] = value;
				if(solveSudoku(mat, row+1, column)){
					return true;
				}
			}
		}
		
		mat[row][column] = 0;
		return false;
	}
	
	public static boolean isLegal(int[][] mat,int row, int column, int value){
		//Row Check
		for(int j = 0; j<9; j++){
			if(mat[row][j]==value){
				return false;
			}
		}
		//Column Check
		for(int i = 0; i<9; i++){
			if(mat[i][column]==value){
				return false;
			}
		}
		//Grid Check
		for(int i = 0+(row/3)*3; i<3+(row/3)*3; i++){
			for(int j = 0+(column/3)*3; j<3+(column/3)*3; j++){
				if(mat[i][j] == value)
					return false;
			}
		}
		return true;
	}
	
	private static void PrintSolution(int[][] mat) {
		for(int i=0; i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(mat[i][j]);
					System.out.print(" ");
			}
		
		}
		System.out.println();
	}

}