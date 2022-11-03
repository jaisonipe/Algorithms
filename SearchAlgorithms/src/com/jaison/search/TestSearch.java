package com.jaison.search;

import com.jaison.sort.QuickSort;
import com.jaison.sort.SelectionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestSearch {

    public static void main(String[] args) {
        int[] input = {20, 70, 10, 28, 46, 55, 11};
        List<Integer> listInput = generateNumberList(100);

        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(input, 46));

        SelectionSort sort = new SelectionSort();
        System.out.println(sort.selectionSort(listInput));

        QuickSort qs = new QuickSort();
        System.out.println(qs.quickSort(listInput));
    }

    private static List<Integer> generateNumberList(int size) {
        Random random = new Random();
        List<Integer> generatedList = new ArrayList<>(size);

        while (size != 0) {
            generatedList.add(random.nextInt(0, 1000));
            size--;
        }
        return generatedList;
    }
}
