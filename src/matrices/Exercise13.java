package matrices;

import java.util.Random;
import java.util.Scanner;

public class Exercise13{
    private int[][] matrix;
    private int n;
    private boolean symmetric;
    
    public void run() {
        generateData();
        printMatrix();
        checkSymmetry();
        printCorners();
        printResult();
    }

    private void generateData(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter size of matrix (n): ");
        n= sc.nextInt();

        matrix= new int[n][n];
        

        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){
                matrix[i][j]=random.nextInt(100)+1;
            }

        }

    }

    private void printMatrix(){
        System.out.println("Matrix:");

        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" "); 
            }
            
            System.out.println();
        }
    }

    private void checkSymmetry(){
        symmetric = true;
       

        for(int i=0; i<n && symmetric; i++){

            for(int j = 0; j<n; j++){

                if(matrix[i][j] != matrix[j][i]){
                    symmetric=false;                
                    System.out.println("La matriz no es simetrica");
                    break;
                }
            }
        }
    }

    private void printCorners(){
        System.out.println();
        System.out.println("Corners of the matrix:");

        System.out.println("Top-left: "+matrix[0][0]);
        System.out.println("Top-right: "+matrix[0][n-1]);
        System.out.println("Bottom-left: "+matrix[n-1][0]);
        System.out.println("Bottom-right: "+matrix[n-1][n-1]);

    }

    private void printResult(){
        System.out.println();

        if(symmetric){
            System.out.println("The matrix is symmetric.");
        } else{
            System.out.println("The matrix is not symmetric.");
        }
        
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();   
    }
}
