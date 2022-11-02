package com.jaison.search;

import java.util.Arrays;

public class BinarySearch {

    public boolean binarySearch(int[] input, int target) {
        Arrays.sort(input);

        int low = 0;
        int high = input.length - 1;
        int mid, midValue;

        while (low <= high) {
            mid = (low + high) / 2;
            midValue = input[mid];

            if (midValue == target) {
                return true;

            } else if (midValue > target) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}

