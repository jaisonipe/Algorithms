package com.jaison.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SelectionSort {

    public List<Integer> selectionSort(List<Integer> input) {
        List<Integer> sortedList = new LinkedList<>();
        while (input.size() != 0) {
            sortedList.add(input.remove(findMinimum(input)));
        }
        return sortedList;
    }

    private int findMinimum(List<Integer> input) {
         return input.indexOf(input.stream().min(Integer::compareTo).get());
    }
}
