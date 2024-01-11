package stackORqueue;

import java.util.Stack;

public class FunctionDev {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});

        for (int i : result) {
            System.out.print(i+" ");
        }
    }

    static class Solution{
        public int[] solution(int[] progresses, int[] speeds) {
            int[] result = new int[progresses.length];
            Stack<Integer> stk = new Stack<>();

            int[] useDay = new int[progresses.length];

            /**
             * pro 별로 speeds 를 계산하여 필요한 기간을 저장
             */
            // useDay = [5, 10, 1, 1, 20, 1]
            // useDay = [0, 5, 0, 0, 15, 0] stk.size = 1 => return 1
            // useDay = [0, 0, 0, 0, 10, 0] stk.size = 3 => return 3
            // useDay = [0, 0, 0, 0, 0, 0] stk.size = 2 => return 2
            // => [1,3,2]

            for (int i = 0; i < progresses.length; i++) {
                while(progresses[i] <100) {
                    progresses[i] += speeds[i];
                    useDay[i]++;
                }
            }

            for (int i = 0; i < useDay.length; i++) {
                int count = 0;

                while(useDay[i]<=0) {
                    useDay[i]--;
                    count++;
                }

                for (int j = 1; j < useDay.length; j++) {
                    for (int k = 0; k < count; k++) {
                     useDay[j]--;
                    }
                }

                stk.push(progresses[i]);
                for (int z = 1; z < useDay.length; z++) {
                    if(useDay[z] <=0 && stk.peek() == progresses[z-1]) {
                        stk.push(progresses[z]);
                    }
                }
                result[i] = stk.size();
                for (int a = 0; a < stk.size(); a++) {
                    stk.pop();
                }
            }
            return result;
        }
    }
}
