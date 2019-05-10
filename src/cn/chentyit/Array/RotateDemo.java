package cn.chentyit.Array;

/**
 * @author Chentyit
 */
public class RotateDemo {

    public static void rotate(int[] nums, int k) {
        if (k == 0 || nums.length == 1) {
            return;
        }
        if (k > nums.length) {
            k = k % nums.length;
        }
        for (int i = 0; i < nums.length / 2; i++) {
            int buf = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = buf;
        }
        for (int i = 0; i < k / 2; i++) {
            int buf = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = buf;
        }
        for (int i = k; i < ((nums.length - k) / 2 + k); i++) {
            int buf = nums[i];
            nums[i] = nums[nums.length - i + k - 1];
            nums[nums.length - i + k - 1] = buf;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        rotate(nums, 4);
    }
}
