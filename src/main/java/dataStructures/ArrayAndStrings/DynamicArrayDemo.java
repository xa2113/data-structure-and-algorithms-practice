package dataStructures.ArrayAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        //1. initialize
        List<Integer> firstArrayList = new ArrayList<>();
        List<Integer> secondArrayList;

        //2. cast an array to a vector
        Integer[] arrayToBeCasted = {0,1,2,3,4,5};
        firstArrayList = new ArrayList<>(Arrays.asList(arrayToBeCasted));

        //3. make a copy
        //make another reference to firstArrayList
        List<Integer> thirdArrayList = firstArrayList;
        //make an actual copy of firstArrayList
        List<Integer> fourthArrayList = new ArrayList<>(firstArrayList);

        //4. get length
        System.out.println(firstArrayList.size());

        //5.access element
        System.out.println(thirdArrayList.get(2));

        //6. iterate the vector
        for(int i = 0; i < firstArrayList.size(); i++){
            System.out.print(firstArrayList.get(i));
        }

    }

}
