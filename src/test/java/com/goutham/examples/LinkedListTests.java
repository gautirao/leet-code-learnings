package com.goutham.examples;

import com.goutham.examples.linkedlist.LinkedList;
import com.goutham.examples.linkedlist.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class LinkedListTests {
    private LinkedList list ;

    @BeforeEach
    public void doEach(){
        list = new LinkedList();
    }
    @Test
    public void testAppend() {
    list.append(1);
    list.append(2);
   List expected = Arrays.asList(1,2);
   List actual = list.getAllData();
   assertEquals(expected,actual);

    }
    @Test
    public void testPrepend() {
        list.prepend(1);
        list.prepend(2);
        List expected = Arrays.asList(2,1);
        List actual = list.getAllData();
        assertEquals(expected,actual);

    }
    @Test
    public void testPrependFail() {
        list.prepend(1);
        list.prepend(2);
        List expected = Arrays.asList(1,2);
        List actual = list.getAllData();
        assertNotEquals(expected,actual);

    }

    @Test
    public void testDeleteAtNthNodeFromEnd() {
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.deleteNodeAtFromEnd(2);
        List expected = Arrays.asList(1,2,3,5);
        List actual = list.getAllData();
        assertNotEquals(expected,actual);

    }
    @Test
    public void testReversal() {
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.reverse();
        List expected = Arrays.asList(5,4,3,2,1);
        List actual = list.getAllData();
        list.printAll();
        assertEquals(expected,actual);

    }


    @Test
    public void testCycle(){
        // 2 -> 4 -> 5 -> 6--I
        //       ^-----------I



        LinkedList list =new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.createCyleAtNthNode(2);

        assertTrue(list.hasCycle(list.head));


    }

    public void testCycleNegativeScenario(){
        // 2 -> 4 -> 5 -> 6

        LinkedList list =new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        assertFalse(list.hasCycle(list.head));

    }
}
