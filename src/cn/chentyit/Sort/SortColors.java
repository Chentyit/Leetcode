package cn.chentyit.Sort;

import java.util.Arrays;

public class SortColors {

    private static void qsort(int[] nums, int left, int right) {
        if (left > right) {
            return;
        }

        int val = nums[left];
        int k = left;

        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < val) {
                nums[k] = nums[i];
                nums[i] = nums[k + 1];
                k++;
            }
        }
        nums[k] = val;

        qsort(nums, left, k - 1);
        qsort(nums, k + 1, right);
    }

    private static void sortColors(int[] nums) {
        qsort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
