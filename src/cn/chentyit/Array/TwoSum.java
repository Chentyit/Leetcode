package cn.chentyit.Array;

import java.util.ArrayList;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/9 22:37
 * @Version 1.0
 */
public class TwoSum {

    private static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }
        ArrayList<Integer> re = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (flag) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        re.add(i);
                        re.add(j);
                        flag = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        int[] result = new int[re.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = re.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = new int[twoSum(nums, 9).length];
        result = twoSum(nums, 9);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
