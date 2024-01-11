package stackORqueue;

import java.util.Stack;

public class FunctionDev {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});

        for (int i : result) {
            System.out.print(i+" ");
        }
    }

    static class Solution{
        public int[] solution(int[] progresses, int[] speeds) {
            int[] result = new int[progresses.length];
            Stack<Integer> stk = new Stack<>();

            int count = 1;
            for (int i = 0; i < progresses.length; i++) {
                int temp = progresses[i];
                while(temp <100) {
                    temp += speeds[i];
                    count++;
                }
                stk.push(progresses[i]);

                if(i == progresses.length-1) break;

                for (int j = 0; j < count; j++) {
                    int temp2 = progresses[i+1];
                    temp2 += speeds[i + 1];
                    if(temp2>=100 && stk.peek() == progresses[i]) stk.push(progresses[i + 1]);
                }
                result[i] += stk.size();

            }
            return result;
        }
    }
}
