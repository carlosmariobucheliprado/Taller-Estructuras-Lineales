
package matrices;

import java.util.Random;
import java.util.Scanner;


public class Exercise15 {
    private int[][] matrix;
    private int rows;
    private int cols;
    public void run() {
        generateData();
        printMatrix();
        swapRows();
        System.out.println();
        System.out.println("Matrix after swapping rows:");
        printMatrix();
    }

    private void generateData(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter number of rows (m): ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        cols = sc.nextInt();
        

        matrix = new int[rows][cols];
        
        for(int i =0; i<rows; i++){
          

            for(int j =0; j<cols; j++){
                matrix[i][j]=random.nextInt(100)+1;   
            }
        }
    }

    private void swapRows(){
        for(int j =0; j<cols; j++){
            int temp = matrix[0][j];

            matrix[0][j] = matrix[1][j];
            matrix[1][j] = temp;
        }
    }

    private void printMatrix(){
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
