package hash;

import java.util.HashMap;

public class Clothes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new String[][]
                {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});

        System.out.println(result);
    }

    /**
     * 총 개수 더한거에다가 + 곱한거(다른종류 의상끼리)
     * 상세하게 무슨 정보인지는 알 필요가 없음 . 그냥 같은 종류 몇 개인지 개수만 count
     */

    static class Solution {
        public int solution(String[][] clothes) {
            HashMap<String, Integer> hs = new HashMap<>();
            // <headgear,2> , <eyewear,1> => (2+1) + (2*1) = 5
            // <face,3> => (3) + (3*0) = 3
            for (String[] clothe : clothes) {
                String type = clothe[1];
                hs.put(type, hs.getOrDefault(type, 0) + 1);
            }
            int sum = 0;
            int mul;
            // type이 1개 일 경우 = 0
            // type이 2개 이상 일 경우 = 1

            if (hs.size() == 1) {
                mul = 0;
            } else {
                mul = 1;
            }

            for (Integer value : hs.values()) {
                sum += value;
                mul *= value;
            }

            System.out.println("hs.size() = " + hs.size());
            return sum + mul;
        }
    }
}
