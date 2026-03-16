
package arraylist;

import java.util.ArrayList;
import java.util.Random;


public class Exercise8{
    
    private ArrayList<Integer> numbers;
    private int[] frequency;
    private int mostRepeatedNumber;
    private int maximumFrequency;

    public void run(){
        generateData();
        processData();
        printResults();
    }

    private void generateData(){
        Random random = new Random();
        numbers=new ArrayList<>();
        
        for(int i=0; i<100; i++){
            int num=random.nextInt(20)+1;
            numbers.add(num);
        }

    }

    private void processData(){
        frequency =new int[21];

        for(int num : numbers){
            frequency[num]++;
        }

        maximumFrequency=0;
        for(int i=1; i<=20; i++){

            if(frequency[i]>maximumFrequency){
                maximumFrequency=frequency[i];
                mostRepeatedNumber=i;
            }
        }
    }

    private void printResults(){
        System.out.println("Numbers:");

        for(int num : numbers){
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Frequency table:");

        for(int i=1; i<=20; i++){
            System.out.println("Number "+i+" -> "+frequency[i]);

        }

        System.out.println();
        System.out.println("Most repeated number: "+mostRepeatedNumber);
        System.out.println("Frequency: "+maximumFrequency);
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
