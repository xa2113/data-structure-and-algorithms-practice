package lintcode;

import java.util.ArrayList;

public class LowerToUpperCase {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> clone(ArrayList<Integer> list) {
        // Write your code here
        ArrayList<Integer> resultArray = new ArrayList<>();
        for(int i : list){
            resultArray.add(i);
        }
        return resultArray;
    }
}
