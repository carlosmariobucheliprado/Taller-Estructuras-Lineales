package arreglos;

public class Exercise2{
    
    private int[] numbers;

    public void run(){
        generateData();
        printOneLine();
        printTenLines();
    }

    private void generateData(){
        numbers= new int[100];

        for (int i =0; i<numbers.length; i++){
            numbers[i]=(i+1)*2;
        }
    }

    private void printOneLine(){
        System.out.println("\nEven numbers in one line:");

        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        

        System.out.println();
    }

    private void printTenLines(){

        System.out.println("\nEven numbers in 10 lines:");

        for (int i=0; i<10; i++){
            System.out.print("Line "+(i+1)+": ");

            for (int j=0;j<10;j++){
                System.out.print(numbers[i*10+j]+" ");
            }
            System.out.println();
        }
        
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
        
    }   
    
    
    
}
