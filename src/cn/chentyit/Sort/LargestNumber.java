package cn.chentyit.Sort;

public class LargestNumber {

    private static void qsort(int[] nums, int left, int right) {
        if (left > right) {
            return;
        }

        int val = nums[left];
        int k = left;

        for (int i = left + 1; i <= right; i++) {
            String n1 = String.valueOf(val);
            String n2 = String.valueOf(nums[i]);
            String v1 = n1 + n2;
            String v2 = n2 + n1;
            if (v1.compareTo(v2) < 0) {
                nums[k] = nums[i];
                nums[i] = nums[k + 1];
                k++;
            }
        }
        nums[k] = val;

        qsort(nums, left, k - 1);
        qsort(nums, k + 1, right);
    }

    private static String largestNumber(int[] nums) {
        qsort(nums, 0, nums.length - 1);
        StringBuilder builder = new StringBuilder();
        for (int n : nums) {
            builder.append(n);
            builder.append(" ");
        }
        return builder.toString().startsWith("0") ? "0" : builder.toString();
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0};
        System.out.println(largestNumber(nums));
    }
}
