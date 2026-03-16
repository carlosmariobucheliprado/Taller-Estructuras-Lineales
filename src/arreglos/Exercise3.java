package arreglos;

import java.util.Random;

public class Exercise3{
    
    private int[] numbers;
    private long[] factorials;
    
    //cantidad de numeros enteros aleatorios elegidos
    private int n = 10;
    
    public void run(){
        generateData();
        processData();
        printResults();
        
    }

    private void generateData(){
    
        Random random = new Random();
        numbers = new int[n];
        factorials = new long[n];
        
        for (int i=0; i<n; i++){
            
            //Genera numeros Aleatorios entre 1 y 5
            numbers[i] = random.nextInt(5) + 1;
            
        }
    }

    private void processData(){
        for (int i = 0;i<n; i++) {
            factorials[i] =factorial(numbers[i]);
        }
    }

    private long factorial(int num){
        long result =1;

        for (int i=1; i<=num; i++){
            result= result*i;
        }

        return result;
    }

    private void printResults(){
        System.out.println("\nOriginal numbers:");
        for (int i=0; i<n; i++){
            System.out.print(numbers[i]+" ");
        }
        
        System.out.println();
        System.out.println("Factorials:");
        for (int i=0; i<n; i++){
            System.out.print(factorials[i]+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
}
