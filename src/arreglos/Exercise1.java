package arreglos;

public class Exercise1{
    private int[] primeNumbers;

    public void run(){
        initializeArray();
        printArray();
    }

    
    private void initializeArray(){

        primeNumbers = new int[]{2,3,5,7,11,13,17,19,23,29};

    }

    
    private void printArray(){

        
        System.out.println("\nPrime numbers:");

        for (int i=0; i<primeNumbers.length; i++){
            System.out.print(primeNumbers[i]+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
}
