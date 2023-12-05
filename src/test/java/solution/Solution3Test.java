package solution;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution3Test {
    private Solution3 solution;
    @Before
    public void beforeTest(){
        solution = new Solution3();
    }
    @Test
    public void testLargestDivisibleSubset(){

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 8};
        List<Integer> expected1 = new ArrayList<Integer>();
        expected1.add(1);
        expected1.add(2);
        expected1.add(4);
        expected1.add(8);
        List<Integer> result1 = solution.largestDivisibleSubset(nums1);
        Collections.sort(result1);
        assertEquals(expected1, result1);

        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 5};
        List<Integer> expected2 = new ArrayList<Integer>();
        expected2.add(1);
        expected2.add(2);
        expected2.add(4);
        List<Integer> result2 = solution.largestDivisibleSubset(nums2);
        Collections.sort(result2);
        assertEquals(expected2, result2);

        // Test case 3
        int[] nums3 = {4, 6, 8, 12, 16};
        List<Integer> expected3 = new ArrayList<Integer>();
        expected3.add(4);
        expected3.add(8);
        expected3.add(16);
        List<Integer> result3 = solution.largestDivisibleSubset(nums3);
        Collections.sort(result3);
        assertEquals(expected3, result3);

        // Test case 4
        int[] nums4 = {3, 9, 15, 27, 81};
        List<Integer> expected4 = new ArrayList<Integer>();
        expected4.add(3);
        expected4.add(9);
        expected4.add(27);
        expected4.add(81);
        List<Integer> result4 = solution.largestDivisibleSubset(nums4);
        Collections.sort(result4);
        assertEquals(expected4, result4);

        // Test case 5
        int[] nums5 = {1};
        List<Integer> expected5 = new ArrayList<Integer>();
        expected5.add(1);
        List<Integer> result5 = solution.largestDivisibleSubset(nums5);
        assertEquals(expected5, result5);

        // Test case 6
        int[] nums6 = {};
        List<Integer> expected6 = new ArrayList<Integer>();
        List<Integer> result6 = solution.largestDivisibleSubset(nums5);
        assertEquals(expected5, result5);

        // Test new case
        int[] nums7 = {1,2,4};
        List<Integer> expected7 = new ArrayList<Integer>();
        expected7.add(4);
        expected7.add(2);
        expected7.add(1);
        List<Integer> result7 = solution.largestDivisibleSubset(nums7);
        assertEquals(expected7, result7);

    }
}
