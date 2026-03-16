package matrices;

public class Exercise14 {
    private int[][] matrix;
    private int[][] transposed;
    private int rows;
    private int cols;

    public void run(){
        generateData();
        transposeMatrix();
        printMatrix();
        printTranspose();
    }

    private void generateData(){
        
        matrix = new int[][]{
            {1, 2, 3},
            {4, 5, 6}
        };
        rows = matrix.length;
        cols = matrix[0].length;
       

    }

    private void transposeMatrix(){
        
        transposed = new int[cols][rows];
        for(int i = 0; i<rows; i++){
            

            for(int j = 0; j<cols; j++){               
                transposed[j][i] = matrix[i][j];    
            }
        }
    }

    private void printMatrix(){
        System.out.println("Original matrix:");

        for(int i=0; i<rows; i++){

            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private void printTranspose(){

        System.out.println();
        System.out.println("Transposed matrix:");

        for(int i=0; i<cols; i++){

            for(int j=0; j<rows; j++){
                System.out.print(transposed[i][j]+" ");
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
