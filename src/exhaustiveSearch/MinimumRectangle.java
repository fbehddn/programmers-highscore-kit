package exhaustiveSearch;

public class MinimumRectangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println(result);
    }

    static class Solution{
        public int solution(int[][] sizes) {
            int answer = 0;

            /**
             * 1. 가로길이가 가장 큰 명함 선택
             * 2. 세로길이가 가장 큰 명함을 선택하고 이 길이가 1에서 선택한 가로길이보다 작고,
             * 3. 해당 명함의 세로길이보다 가로길이가 작아야함 -> 가로 세로 뒤집기
             * 4. 이후 모든 명함의 가로길이보다 세로길이가 작은지 확인 후,
             * => 1에서 선택한 명함의 가로 길이 * 세로 길이가 가장 큰 명함의 세로길이
             */
            return answer;
        }
    }
}
