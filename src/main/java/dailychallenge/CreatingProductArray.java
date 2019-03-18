package dailychallenge;

//Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//
//For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

import java.util.Arrays;

public class CreatingProductArray {

    public static void main(String[] args) {

        int[] testArray = {1,2,3,4,5};
        System.out.println(createArrayOfProduct(testArray).toString());


    }

    public static int[] createArrayOfProduct(int[] inputArray){
        for(int i = 0; i < inputArray.length; ){
            for(int n = 0; n < inputArray.length; n++){
                inputArray[i] *= inputArray[n] / inputArray[i];
                i++;
            }
        }
        return inputArray;
    }

}
