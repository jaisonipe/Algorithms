package com.jaison.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        } else {
            int pivot = arr.get(0);

            List<Integer> leftArr = new ArrayList<>();
            List<Integer> rightArr = new ArrayList<>();

            for (int i=1; i < arr.size(); i++) {
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
