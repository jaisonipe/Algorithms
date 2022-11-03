package com.jaison.search;

import com.jaison.sort.SelectionSort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestSearch {

    public static void main(String[] args) {
        int[] input = {20, 70, 10, 28, 46, 55, 11};

        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(input, 46));

        SelectionSort sort = new SelectionSort();
        System.out.println(sort.selectionSort(Arrays.stream(input).boxed().collect(Collectors.toList())));
    }
}
