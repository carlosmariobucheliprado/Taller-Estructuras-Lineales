package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise9{
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> ascendingNumbers;
    private ArrayList<Integer> descendingNumbers;
    private ArrayList<Integer> evenNumbers;
    private ArrayList<Integer> oddNumbers;
   

    public void run(){
        generateData();
        sortNumbers();
        separateNumbers();
        printResults();
    }

    private void generateData(){
        Random random = new Random();
        numbers = new ArrayList<>();

        for (int i=0; i<20; i++) {
            int num = random.nextInt(100)+1;
            numbers.add(num);
        }
    }

    private void sortNumbers(){
        ascendingNumbers = new ArrayList<>(numbers);
        Collections.sort(ascendingNumbers);      
        descendingNumbers = new ArrayList<>(ascendingNumbers);      
        Collections.reverse(descendingNumbers);
    }

    private void separateNumbers(){
        evenNumbers = new ArrayList<>();
        oddNumbers = new ArrayList<>();
        
        for(int num : numbers){
            if(num%2 == 0){
                evenNumbers.add(num);
            } else{
                oddNumbers.add(num);
            }
        }
    }

    private void printResults(){
        System.out.println("Original numbers:");

        for(int num : numbers){
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Ascending order:");
        
        for(int num : ascendingNumbers){
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Descending order:");

        for(int num : descendingNumbers){
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Even numbers:");

        for(int num : evenNumbers){
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Odd numbers:");

        for(int num : oddNumbers){
            System.out.print(num+" ");
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}

