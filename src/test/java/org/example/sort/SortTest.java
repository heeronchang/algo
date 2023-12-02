package org.example.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void selectionSort() {
        int[] nums = {1, 5, 3, 8, 2, 9, 6};

        Sort.selectionSort(nums);
        int[] expect = {1, 2, 3, 5, 6, 8, 9};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void selectionSort2() {
        int[] nums = {1, 5, 3, 8, 2, 9, 6};
        Sort.selectionSort2(nums);
        int[] expect = {1, 2, 3, 5, 6, 8, 9};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void bubbleSort() {
        int[] nums = {1, 5, 3, 8, 2, 9, 6};
        Sort.bubbleSort(nums);
        int[] expect = {1, 2, 3, 5, 6, 8, 9};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void insertionSort() {
        int[] nums = {1, 5, 3, 8, 2, 9, 6};
        Sort.insertionSort(nums);
        int[] expect = {1, 2, 3, 5, 6, 8, 9};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void quickSort() {
        int[] nums = {1, 5, 3, 8, 2, 9, 6};
        Sort.quickSort(nums);
        int[] expect = {1, 2, 3, 5, 6, 8, 9};
        Assertions.assertArrayEquals(expect, nums);
    }

    @Test
    void mergeSort() {
        int[] nums = {1, 5, 3, 8, 2, 9, 6};
        Sort.mergeSort(nums);
        int[] expect = {1, 2, 3, 5, 6, 8, 9};
        Assertions.assertArrayEquals(expect, nums);
    }
}