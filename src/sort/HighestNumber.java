package sort;

import java.util.ArrayList;
import java.util.Collections;

public class HighestNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new int[]{6, 10, 2});

        System.out.println(result);
    }

    static class Solution{
        public String solution(int[] numbers) {
            String answer = "";

            /**
             * 가장 큰 자리수를 기준으로 큰 수부터 정렬
             *
             * 와 레전드 발상
             * 그냥 각각의 자리수 모두 일차 배열에 담고 내림차순 정렬해서 출력하면 ?
             */

            ArrayList<String> temp = new ArrayList<>();

            for (int number : numbers) {
                temp.add(Integer.toString(number));
            }
            // temp[0] = 6, temp[1] = 10, temp[2] = 2

            ArrayList<Integer> intList = new ArrayList<>();
            int count = 0;
            for (String s : temp) {
                for (int i = 0; i < s.length(); i++) {
                    intList.add(Integer.parseInt(Character.toString(s.charAt(i))));
                }
            }

            //intArr[0] = 6, intArr[1] = 1, intArr[2] = 0, intArr[3] = 2

            Collections.sort(intList);
            for (int i = intList.size() - 1; i >= 0; i--) {
                answer += Integer.toString(intList.get(i));
            }
            return answer;
        }
    }
}
