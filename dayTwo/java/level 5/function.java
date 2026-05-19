import java.util.Arrays;

public class function {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        System.out.print(Arrays.toString(primeArraySorting(array)));

    }
    

    public static int[] primeArraySorting(int[] numbers) {
        
        int count = 0;
        
        for (int index : numbers) {
         
        boolean isPrime = true;

            for(int number = 2; number <= Math.sqrt(index); number++ ) {

                if(index % number == 0){

                    isPrime = false;

                }  
        
             }

            if (isPrime == true){

                    count++;  

            }

        }

        int [] primeArray = new int[count];

        int number = 0;

        for(int index : numbers) {

            boolean isPrime = true;

            for( number = 2; number <= Math.sqrt(index); number++) {

                if(index % number == 0){

                    isPrime = false;
                
                }

            }

            if (isPrime == true){

                    primeArray[index] = number;

                    index++;
                
        
            }
        
        }

    return primeArray;

    }

}

   
