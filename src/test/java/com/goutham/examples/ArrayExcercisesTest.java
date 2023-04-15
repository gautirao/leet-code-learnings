package com.goutham.examples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class ArrayExcercisesTest {
    private ArrayExcercises arrayExcercises ;

    @BeforeEach
    public void doEach(){
        arrayExcercises = new ArrayExcercises();
    }
    @Test
    public void testFindDuplicatesArray() {
        int[] unsorted = { 2,2,1};
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = arrayExcercises.findDuplicatesInArray(unsorted);
        assertEquals(actual, expected);
    }    @Test
    public void testFindDuplicatesConstantSpaceArray() {
        int[] unsorted = { 2,2,1};
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = arrayExcercises.findDuplicatesConstantSpace(unsorted);
        assertEquals(actual, expected);
    }
}
