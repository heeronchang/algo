package org.example.sort;

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

    // insertSort
    // 工作原理与手动整理一副牌的过程非常相似。
    // 具体来说，我们在未排序区间选择一个基准元素，
    // 将该元素与其左侧已排序区间的元素逐一比较大小，并将该元素插入到正确的位置
    // https://www.hello-algo.com/chapter_sorting/insertion_sort/
    static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                }
            }
        }
    }

    // https://www.hello-algo.com/chapter_sorting/quick_sort/
    static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = partition(nums, left, right);
        quickSort(nums, left, mid - 1);
        quickSort(nums, mid + 1, right);
    }

    private static int partition(int[] nums, int left, int right) {
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && nums[j] > nums[left]) {
                j--;
            }
            while (i < j && nums[i] <= nums[left]) {
                i++;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        int tmp = nums[left];
        nums[left] = nums[i];
        nums[i] = tmp;

        return i;
    }

    // 分为划分和合并阶段
    // 划分到子数组剩一个元素
    // 合并时排序
    static void mergeSort(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        mergeSort(nums, left, right);
    }

    private static void mergeSort(int[] nums, int left, int right) {
        // 终止条件
        if (left >= right) {
            return;
        }

        // 划分阶段
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        // 合并阶段
        merge(nums, left, mid, right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        // 临时数组
        int[] tmp = new int[right - left + 1];
        // 取左右数组中较小者，放入临时数组
        int i = left, j = mid + 1, k = 0; // 左右子数组到起始索引
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
            } else {
                tmp[k++] = nums[j++];
            }
        }

        // 将没遍历完到子数组中的数据放入临时数组
        while (i <= mid) {
            tmp[k++] = nums[i++];
        }
        while (j <= right) {
            tmp[k++] = nums[j++];
        }

        // 从临时数组中放回原数组
//        for (int l = 0; l < tmp.length; l++) {
//            nums[left + l] = tmp[l];
//        }
        System.arraycopy(tmp, 0, nums, left, tmp.length);
    }

    static void heapSort(int[] nums) {
    }

    static void bucketSort(int[] nums) {
    }

    static void countingSort(int[] nums) {
    }
}
