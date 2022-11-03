package com.jaison.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {

    private static final Random random = new Random();

    public List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        } else {
            int randomIndex = random.nextInt(0, arr.size());
            int pivot = arr.get(randomIndex);

            List<Integer> leftArr = new ArrayList<>();
            List<Integer> rightArr = new ArrayList<>();

            for (int i=0; i < arr.size(); i++) {
                if (randomIndex == i) {
                    continue;
                }

                if (pivot <= arr.get(i)) {
                    rightArr.add(arr.get(i));
                } else {
                    leftArr.add(arr.get(i));
                }
            }
            leftArr = quickSort(leftArr);
            leftArr.add(pivot);
            leftArr.addAll(quickSort(rightArr));
            return leftArr;
        }
    }
}
