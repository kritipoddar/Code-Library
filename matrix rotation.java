
import java.util.Scanner;

public class RotateMatrix
{
    static int rows = 0;
    static int cols = 0;

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        cols = scan.nextInt();
        int rots = scan.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < rots; i++)
            rotate(matrix, 0, rows - 1, 0, cols - 1);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }

    public static int[][] rotate(int[][] arr, int rowStart, int rowEnd, int colStart, int colEnd)
    {

        if (rowStart == rowEnd && colStart == colEnd)
        {
            return arr;
        }
        if (rowStart > rowEnd || colStart > colEnd)
        {
            return arr;
        }

        int temp = arr[rowStart][colStart];
        for (int i = rowStart; i <rowEnd; i++)
        {
            arr[i][colStart]=arr[i+1][colStart] ;
        }
        for (int i = colStart; i <colEnd; i++)
        {
            arr[rowEnd][i]=arr[rowEnd][i+1];
        }
        for (int i = rowEnd; i >rowStart; i--)
        {
           arr[i ][colEnd]= arr[i-1][colEnd] ;
        }
        for (int j = colEnd; j > colStart; j--)
        {
           arr[colStart][j]= arr[colStart][j-1]  ;
        }
        
        
        

        if (rows == 1)
        {
            arr[colEnd][rowStart] = temp;
        }
        else
            arr[rowStart ][colStart+1] = temp;

        
        rotate(arr, rowStart + 1, rowEnd - 1, colStart + 1, colEnd - 1);
        return arr;
    }
}