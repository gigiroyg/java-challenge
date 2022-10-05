package com.hackerrank.challenges;

import java.util.*;

/**
 * Java Challenge
 *
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * The function should find all quadruplets in the array that sum up to the target sum and return
 * a two-dimensional array of all these quadruplets in no particular order.
 *
 * If no four numbers sum up to the target sum, the function should return an empty array.
 */
public class JavaChallenge {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {

        // get the array size
        int arraySize = array.length;

        // check the size of the array
        if (arraySize < 4) {
            return new ArrayList<>();
        }

        // the list to return
        List<Integer[]> quadrupletsList = new ArrayList<>();

        // the sum of numbers
        int sum = 0;

        // array to save quadruplets found
        Integer[] quadrupletTemp = new Integer[4];

        // loops for search in array
        // find 4 elements
        for (int i = 0; i < arraySize - 3; i++) {

            for (int j = i + 1; j < arraySize - 2; j++) {

                for (int k = j + 1; k < arraySize - 1; k++) {

                    for (int m = k + 1; m < arraySize; m++) {

                        // the sum of four numbers from the array
                        sum = sum + array[i] + array[j] + array[k] + array[m];

                        if (sum == targetSum) {
                            quadrupletTemp[i] = array[i];
                            quadrupletTemp[j] = array[j];
                            quadrupletTemp[k] = array[k];
                            quadrupletTemp[m] = array[m];
                            quadrupletsList.add(quadrupletTemp);
                            sum = 0;
                        }

                    }

                }

            }
        }

        return quadrupletsList;
    }

    public static void main(String[] vars) {

        // Given an array
        int[] array = { 7, 6, 4, -1, 1, 2 };

        // Given a target sum
        int targetSum = 16;

        // Call method to get the quadruplts
        List<Integer[]> integers = fourNumberSum(array, targetSum);

        for (Integer[] val : integers) {
            System.out.println(Arrays.toString(val));
        }

        // Given an array2
        int[] array2 = { 1, 2, 3, 4, 5, 6, 7 };

        // Given a target sum
        int targetSum2 = 10;

        // Call method to get the quadruplts
        List<Integer[]> integers2 = fourNumberSum(array2, targetSum2);

        for (Integer[] val : integers2) {
            System.out.println(Arrays.toString(val));
        }

        // Given an array3
        int[] array3 = { -1, 22, 18, 4, 7, 11, 2, -5, -3 };

        // Given a target sum
        int targetSum3 = 30;

        // Call method to get the quadruplts
        List<Integer[]> integers3 = fourNumberSum(array3, targetSum3);

        for (Integer[] val : integers3) {
            System.out.println(Arrays.toString(val));
        }

    }
}
