package leetcode.easy;

public class Recursion {

    public static void main(String[] args) {
        RecursionWithLoops looptest = new RecursionWithLoops();
        looptest.findPrimeWithIteration(8);
    }

    public void findPrime(int number){
        if(number == 0 ){
            return;
        }
        if(isPrime(number)){
            System.out.println(number);
        }
        findPrime(number-1);
    }

    private boolean isPrime(int number) {
        return false;
    }
}


class RecursionWithLoops{

    public void findPrimeWithIteration(int number){
        boolean isPrime = true;
        int i;
        for(i = 0; i < number; i ++){
            for( int j = 2; j < i; j++){
                if(j%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println(i);
        }
    }

}
