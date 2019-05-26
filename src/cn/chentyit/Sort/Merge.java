package cn.chentyit.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {

    private static int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = Math.max(intervals[i][1], intervals[i + 1][1]);
            } else {
                list.add(intervals[i]);
            }
        }
        list.add(intervals[intervals.length -1]);
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = list.get(i)[0];
            result[i][1] = list.get(i)[1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][] {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        intervals = merge(intervals);
        for (int[] arr : intervals) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
