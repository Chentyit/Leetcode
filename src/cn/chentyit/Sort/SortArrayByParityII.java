package cn.chentyit.Sort;

/**
 * @Date 2019/7/23
 * @Author Chentyit
 * @Description
 */
public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        int even = 0;
        int odd = 1;
        while (even < A.length && odd < A.length) {
            if (A[even] % 2 == 0) {
                even += 2;
                continue;
            }
            if (A[odd] % 2 != 0) {
                odd += 2;
                continue;
            }
            int buf = A[even];
            A[even] = A[odd];
            A[odd] = buf;
        }
        return A;
    }

    public static void main(String[] args) {

    }
}
