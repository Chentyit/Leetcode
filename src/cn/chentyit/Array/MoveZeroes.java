package cn.chentyit.Array;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/8 23:09
 * @Version 1.0
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int buf = nums[i];
                        nums[i] = nums[j];
                        nums[j] = buf;
                        break;
                    }
                }
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrs = new int[]{0, 1, 0, 3, 12, 0};
        moveZeroes(arrs);
    }
}
