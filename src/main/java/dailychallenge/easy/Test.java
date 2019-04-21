package dailychallenge.easy;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        System.out.println(deduplication(nums));
    }

    public static int deduplication(int[] nums) {
        // write your code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println(printNums(set));
        return set.size();
    }

    public static int[] printNums(HashSet<Integer> hset){
        int[] resultArray = new int[hset.size()];
        int i = 0;
        for(int s : hset){
            resultArray[i++] = s;
        }
        return resultArray;
    }


}
