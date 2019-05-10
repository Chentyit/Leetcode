package cn.chentyit.Array;

import java.math.BigInteger;

/**
 * @author Chentyit
 */
public class PlusOne {

    private static int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] >= 10) {
                if (i - 1 >= 0){
                    digits[i] -= 10;
                    digits[i - 1]++;
                }
            }
        }
        if (digits[0] >= 10) {
            int[] re = new int[digits.length + 1];
            digits[0] -= 10;
            re[0] = 1;
            for (int i = 1; i < re.length; i++) {
                re[i] = digits[i - 1];
            }
            return re;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9, 9, 9, 9};
        int[] result = plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
