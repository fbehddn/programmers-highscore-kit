package stackORqueue;

import java.util.Stack;

public class HateSameNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1});

        for (int i : result) {
            System.out.println(i);
        }
    }
    static class Solution{
        public int[] solution(int []arr) {
            Stack<Integer> stk = new Stack<>();

            for (int i : arr) {
                if (stk.isEmpty()) stk.push(i);
                if (!stk.peek().equals(i)) stk.push(i);
            }

            return stk.stream().mapToInt(i -> i).toArray();
        }
    }
}
