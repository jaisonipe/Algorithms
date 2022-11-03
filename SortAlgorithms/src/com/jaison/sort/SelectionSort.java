package com.jaison.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SelectionSort {

    public List<Integer> selectionSort(List<Integer> input) {
        List<Integer> copy = new ArrayList<>(input);
        List<Integer> sortedList = new LinkedList<>();
        while (copy.size() != 0) {
            sortedList.add(copy.remove(findMinimum(copy)));
        }
        return sortedList;
    }

    private int findMinimum(List<Integer> input) {
         return input.indexOf(input.stream().min(Integer::compareTo).get());
    }
}
