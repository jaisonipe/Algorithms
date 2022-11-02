package com.jaison.search;

public class TestSearch {

    public static void main(String[] args) {
        int[] input = {20, 70, 10, 28, 46, 55, 11};
        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(input, 46));
    }
}
