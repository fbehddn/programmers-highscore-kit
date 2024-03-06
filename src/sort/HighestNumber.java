package sort;

import java.util.Arrays;

public class HighestNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new int[]{6, 10, 2});

        System.out.println(result);
    }

    static class Solution{
        public String solution(int[] numbers) {
            /**
             * int idx = 0
             * charAt[idx] 가장 큰 배열원소 List 에 추가
             * 만약 3, 30, 34 로 charAt[0] 값이 같으면 idx++ 값이 큰 순서대로 List 에 추가
             * 이때 330 > 303 이므로 "자리수가 존재하지 않는 값 > 자리수가 0인 값" 으로 판정
             */

            String[] strArr = new String[numbers.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(strArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

            if(strArr[0].equals("0")) return "0";

            return String.join("", strArr);
        }
    }
}
