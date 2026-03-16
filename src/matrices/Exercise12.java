
package matrices;

import java.util.Random;
import java.util.Scanner;


public class Exercise12{
    private int[][] matrix;
    private int n;
    private int sum;
    
    
    public void run(){
        generateData();
        printMatrix();
        calculateSum();
        printResults();
    }

    private void generateData(){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter size of matrix (n): ");
        n=sc.nextInt();
        matrix= new int[n][n];
        

        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                matrix[i][j]=random.nextInt(101)-50;
            }
        }
    }

    private void printMatrix(){
        System.out.println("Matrix:");

        for(int i=0; i<n; i++) {
            
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private void calculateSum(){
        sum = 0;
        
        for(int i = 0; i<n; i++){
            sum+= matrix[i][n-1-i];
        }
    }

    private void printResults(){
        System.out.println();
        System.out.println("Sum of secondary diagonal: "+sum);
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
