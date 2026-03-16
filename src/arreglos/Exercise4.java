
package arreglos;

import java.util.Random;


public class Exercise4{
    
    private int[] numbers;
    private int minimum;
    private int maximum;
 
    public void run(){
        generateData();
        processData();
        printResults();
    }

    private void generateData(){
        Random random = new Random();
        numbers = new int[25];
        
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(101) - 50;  
        }
    }

    private void processData(){
        minimum = numbers[0];       
        maximum = numbers[0];
        

        for (int i = 1; i < numbers.length; i++){

            if (numbers[i] < minimum){
                minimum = numbers[i];
            }

            if (numbers[i] > maximum){
                maximum = numbers[i];               
            }
        }
    }

    private void printResults(){
    // Método que imprime los resultados

        System.out.println("\nNumbers:");

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        
        System.out.println("Minimum number: " + minimum);
        System.out.println("Maximum number: " + maximum);
        
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
}
