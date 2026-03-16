
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7{
    private ArrayList<Integer> numbers;

    public void run(){

        generateData();
        printList();
        
        insertNumber();
        printList();
        
        removeNumber();
        printList();

    }

    private void generateData(){
        numbers = new ArrayList<>();

        for(int i=1; i<= 20; i++){
            numbers.add(i*2);
        }

    }

    private void insertNumber(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to insert: ");
        int num=sc.nextInt();

        int position=0;

        while(position<numbers.size() && numbers.get(position)<num){
            position++;
        }

        numbers.add(position,num);

    }

    private void removeNumber(){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number to remove: ");
        int num=sc.nextInt();

        numbers.remove(Integer.valueOf(num));

    }

    private void printList(){

        System.out.println("ArrayList:");

        for(int num : numbers){
            System.out.print(num+" ");
        }
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
