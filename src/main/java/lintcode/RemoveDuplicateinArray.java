package lintcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateinArray {

    public class Solution {
        /**
         * @param nums: an array of integers
         * @return: the number of unique integers
         */
        public int deduplication(int[] nums) {
            // write your code here
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < nums.length; i++){
                set.add(nums[i]);
            }
            int[] resultArray = printNums(set);

            System.out.println(Arrays.toString(resultArray));

            return set.size();
        }

        public int[] printNums(HashSet<Integer> hset){
            int[] resultArray = new int[hset.size()];
            int i = 0;
            for(int s : hset){
                resultArray[i++] = s;
            }
            return resultArray;
        }
    }
}
