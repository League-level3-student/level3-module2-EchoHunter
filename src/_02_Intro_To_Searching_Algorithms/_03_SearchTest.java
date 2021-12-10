package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */


    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	_01_LinearSearch l = new _01_LinearSearch();
        String[] l1 = {"108","45","17","76","91","83","61","14"};
        String[] l2 = {"Mexico", "The United States of America", "Italy", "Brazil", "China", "Afghanistan"};
        String[] l3 = {"Michael", "Gizem", "Ozan", "Eddie", "Tate"};
        
        
    	assertEquals(l.linearSearch(l1, "76"), 3);
    	assertEquals(l.linearSearch(l2, "Italy"),2);
    	assertEquals(l.linearSearch(l3, "Eddie"),3);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	_02_BinarySearch b = new _02_BinarySearch();
    	int[] b1 = {1,2,3,4,5,6,7,8,9,10};
    	int[] b2 = {19, 24, 83, 106, 903, 11000};
    	int[] b3 = {555,556,557,558,559,5510};
    	
    	
    	assertEquals(b.binarySearch(b1, 0, b1.length, 7), 6);
    	assertEquals(b.binarySearch(b2, 0, b2.length, 903), 4);
    	assertEquals(b.binarySearch(b3, 0, b3.length, 556), 1);
    }
}
