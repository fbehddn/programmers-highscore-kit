package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}});

        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            ArrayList<Integer> result = new ArrayList<>();

            for (int[] command : commands) {
                ArrayList<Integer> temp = new ArrayList<>();
                int start = command[0];
                int end = command[1];
                int k = command[2];


                for (int i = start-1; i < end; i++) {
                    temp.add(array[i]);
                }

//                int idx = 0;
//                Arrays.sort(temp.stream().mapToInt(i -> i).toArray());
//                for (Integer integer : temp) {
//                    System.out.println(idx++ +"번째 temp 원소 =" + integer);
//                }

                Collections.sort(temp);
                result.add(temp.get(k-1));
            }

            return result.stream().mapToInt(i -> i).toArray();
        }
    }
}
