package arreglos;

import java.util.Random;

public class Exercise5{
    
    private int[] numbers;
    private int[] reversedNumbers;

    public void run(){
        generateData();
        processData();
        printResults();
    }

    private void generateData(){
        Random random= new Random();

        numbers= new int[20];
        reversedNumbers= new int[20];

        for (int i=0; i<numbers.length; i++){
            //genera numeros entre 0 y 30
            numbers[i] = random.nextInt(30)+1;
        }
    }

    private void processData(){
        for (int i=0; i<numbers.length; i++){
            reversedNumbers[i]= reverseNumber(numbers[i]);
        }
    }

    private int reverseNumber(int num){

      
        int reversed=0;

        while (num>0){
            int digit= num%10;
            reversed= reversed*10+digit;
            num=num/10;
        }
        return reversed;
    }

    private void printResults(){

        System.out.println("Original numbers:");

        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println();

        System.out.println("Reversed numbers:");

        for (int i = 0; i < reversedNumbers.length; i++){
            System.out.print(reversedNumbers[i]+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
}
