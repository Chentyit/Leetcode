package cn.chentyit.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert {

    private static int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval.length == 0) {
            return intervals;
        }
        if (intervals.length == 0 || intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        boolean p = false;
        boolean n = false;
        boolean in = false;
        List<int[]> list = new ArrayList<>();
        int[] buf = new int[] {0, 0};
        for (int i = 0; i < intervals.length; i++) {
            if ((intervals[i][1] >= newInterval[0] && newInterval[0] >= intervals[i][0]) && !p) {
                p = true;
                in = true;
            } else if ((intervals[i][1] >= newInterval[1] && newInterval[1] >= intervals[i][0]) && !n) {
                n = true;
                in = true;
            }
            if (in && p) {
                p = false;
                buf[0] = intervals[i][0];
                continue;
            } else if (in && n) {
                in = false;
                buf[1] = intervals[i][1];
                list.add(buf);
                continue;
            }
            if (!in) {
                list.add(intervals[i]);
            }
        }
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
                {6, 9}
        };
        int[] newInterval = new int[] {2, 5};
        intervals = insert(intervals, newInterval);
        for (int[] arr : intervals) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
