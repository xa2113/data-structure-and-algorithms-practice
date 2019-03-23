package dailychallenge.easy;

//Given a 32-bit signed integer, reverse digits of an integer.


public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverseInteger(123));

        System.out.println(123 % 10); //why am I so bad at mathhhhhhhh :(
        System.out.println(12.3 % 10); //ok need to be more positive - I'm improvable at Math :)
        System.out.println(1.23 % 10);
    }

    public static int reverseInteger(int x){
        long res = 0;
        while(x != 0){
            res = res * 10 + x % 10;
            x = x /10;
        }
        if(res < Integer.MAX_VALUE || res > Integer.MAX_VALUE){
            return 0;
        } else {
            return (int) res;
        }

    }

}

//    public static Integer reverseInteger(Integer input){
//        int first = input / 100;
//        int second = (input - (first * 100) ) / 10;
//        int third = input -  (first * 100) - (second * 10);
//
//        int reversedInt;
//        if(third == 0) {
//            reversedInt = second * 10 + first;
//        } else if (third == 0 && second == 0){
//            reversedInt = first;
//
//        } else{
//            reversedInt =  third * 100 + second * 10 + first;
//        }
//
//        return reversedInt;
//    }
