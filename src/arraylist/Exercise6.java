
package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Exercise6{
    private ArrayList<Integer>numbers;
    
    
    private int sum;
    // Variable para guardar la media
    private double average;

    
    public void run(){
        generateData();
        processData();
        printResults();
    }

    private void generateData(){

        Random random = new Random();
        numbers=new ArrayList<>();

        int num;

        do{
            num=random.nextInt(21)-10;
            numbers.add(num);
        } while(num!=10);

    }

    private void processData(){

        sum=0;

        for(int num : numbers){
            sum+=num;
        }

        average=(double)sum/numbers.size();
    }

    private void printResults(){

        System.out.println("Numbers: ");

        for(int num : numbers){
            System.out.print(num+" ");
        }

        System.out.println();

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();   
    }
}
