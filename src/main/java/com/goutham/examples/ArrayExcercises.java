package com.goutham.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class ArrayExcercises
{
    public static void main( String[] args )
    {
        int[] unsorted = {5,2,4,4,1,3};
        ArrayExcercises arr = new ArrayExcercises();
        arr.findDuplicatesInArray(unsorted);
        arr.findDuplicatesConstantSpace(unsorted);
    }

    // assume ; values do not exceed size of array and are positive
    // hint the value of the item can be a index of the array , iterate each element get the index value by substracting by 1
    public List<Integer> findDuplicatesConstantSpace(int[] unsorted){
        List<Integer> duplicateItems = new ArrayList<>();
        for ( int i = 0 ; i < unsorted.length; i++ ){
            int index = Math.abs(unsorted[i]) -1 ;
            if(unsorted[index] < 0)
                duplicateItems.add(index+1);
            unsorted[index] = unsorted[index] * -1;
        }

        return duplicateItems;

    }

    public List<Integer> findDuplicatesInArray(int[] unsorted) {
        Set<Integer> uniqueSet = new HashSet<Integer>();
        Set<Integer> duplicateItems = new HashSet<Integer>();

        for( int num : unsorted ){
            if(uniqueSet.contains(num))
                duplicateItems.add(num);
         uniqueSet.add(num);
        }
        return duplicateItems.stream().collect(Collectors.toList());
    }
}
