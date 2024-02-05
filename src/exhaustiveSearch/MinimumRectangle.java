package exhaustiveSearch;

public class MinimumRectangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println(result);
    }

    static class Solution{
        public int solution(int[][] sizes) {

            /**
             * 1. 가로 > 세로 가 되게 명함 눕히기
             * 2. 가로길이들 중 가장 큰 값, 세로 길이들 중 가장 큰 값 선택
             * 3. 2 에서 고른 두 값 곱하기
             */

            int maxW = 0;
            int maxH = 0;

            for (int[] size : sizes) {
                int tempMax = Math.max(size[0], size[1]);
                int tempMin = Math.min(size[0], size[1]);

                maxW = Math.max(maxW, tempMax);
                maxH = Math.max(maxH, tempMin);
            }

            return maxW * maxH;
        }
    }
}
