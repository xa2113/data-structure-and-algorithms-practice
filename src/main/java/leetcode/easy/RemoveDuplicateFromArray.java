package leetcode.easy;

//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        int[] test = {0,0,1,1,1,2,2,3,3,4};

        removeDuplicate(test);
    }

    public static int removeDuplicate(int[] inputArray){
        int maxSize = inputArray[inputArray.length] - inputArray[0];

        System.out.println(maxSize);
        return maxSize;
    }

}
