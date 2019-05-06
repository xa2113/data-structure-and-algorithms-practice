package leetcode.easy;

//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

import java.util.HashMap;
import java.util.Map;

public class FindingNumbersThatSumToK {

    public static void main(String[] args) {
        int[] testArray = {12,5,3,7};
        int k = 8;

        //findingSum(testArray,k);
        System.out.println(twoSum(testArray, k));


    }

    public static int[] findingSum(int[] inputArray, int k){
        for(int i = 0; i < inputArray.length; i++){
            for(int n = 0; n < inputArray.length; n++){
                if(inputArray[i] + inputArray [n] == k){
                    int[] result = {inputArray[i],inputArray[n]};
                    return result;
                }
            }
        } return null;
    }


    //Two-pass Hash Table
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            //      key,    value
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No solution found.");
    }

}
