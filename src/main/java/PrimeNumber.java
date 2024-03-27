import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> primeNumber = new ArrayList<>();
for (int numberToCheck = 2; numberToCheck<=100; numberToCheck++){
    boolean isPrime = true;
    for(int factor =2; factor <= numberToCheck/2; factor++){
        if(numberToCheck % factor == 0){
           isPrime= false;
           break;
        }
    }
if (isPrime){
    primeNumber.add(numberToCheck);

}
}
        System.out.println("Prime number for 1 to 100 are:");
    }
}
