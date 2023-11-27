package org.example.sort;

import java.util.Arrays;

public class Sort {
    // SelectionSort
    // https://www.hello-algo.com/chapter_sorting/selection_sort/
    // 每轮从未排序区间选择最小的元素，将其放到已排序区间的末尾
    static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

    // SelectionSort
    static void selectionSort2(int[] nums) {
        int n = nums.length;
        // 最后一个元素无须排序，所以i < n-1即可
        for (int i = 0; i < n - 1; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[k]) {
                    k = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[k];
            nums[k] = tmp;
        }
    }

    // bubble sort
    // 通过连续地比较与交换相邻元素实现排序，每轮在剩余对n-i个元素中冒出一个最大的
    // https://www.hello-algo.com/chapter_sorting/bubble_sort/
    static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - i; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    static void insertSort(int[] nums) {}

    static void quickSort(int[] nums) {}

    static void mergeSort(int[] nums) {}

    static void heapSort(int[] nums) {}

    static void bucketSort(int[] nums) {}

    static void countingSort(int[] nums) {}
}