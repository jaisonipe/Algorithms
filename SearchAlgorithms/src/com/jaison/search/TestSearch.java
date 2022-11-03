package com.jaison.search;

import com.jaison.sort.QuickSort;
import com.jaison.sort.SelectionSort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestSearch {

    public static void main(String[] args) {
        int[] input = {20, 70, 10, 28, 46, 55, 11};
        List<Integer> listInput = Arrays.stream(input).boxed().collect(Collectors.toList());

        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(input, 46));

        SelectionSort sort = new SelectionSort();
        System.out.println(sort.selectionSort(listInput));

        QuickSort qs = new QuickSort();
        System.out.println(qs.quickSort(listInput));
    }
}
