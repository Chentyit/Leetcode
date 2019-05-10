package cn.chentyit.Array;

import java.util.Arrays;

public class SingleNumber {

    private static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 9, 7, 7, 8, 8, 3, 3};
        System.out.println(singleNumber(nums));
    }
}
