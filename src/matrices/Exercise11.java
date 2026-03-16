package matrices;

import java.util.Random;
import java.util.Scanner;

public class Exercise11{
    private int[][] matrix;
    private int rows;
    private int cols;

    public void run(){
        generateData();
        printMatrix();
        searchNumber();
    }

    private void generateData(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        matrix = new int[rows][cols];
        for(int i=0; i<rows; i++){
            
            for (int j=0; j<cols; j++){
                matrix[i][j]=random.nextInt(100)+1;
            }
        }

    }

    private void printMatrix(){
        System.out.println("Matrix: ");

        for(int i=0; i<rows; i++) {

            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
    }

    private void searchNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();
        boolean found = false;

        
        for(int i=0; i<rows && !found; i++){

            for(int j=0; j<cols; j++){

                if(matrix[i][j] == num){
                    System.out.println("Number found at row "+(i+1)+" column "+(j+1));
                    found=true;
                    break;
                }
            }
        }

        if(!found){
            System.out.println("Number not found in the matrix.");
        }
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
