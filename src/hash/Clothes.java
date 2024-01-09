package hash;

import java.util.HashMap;

public class Clothes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new String[][]
                {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});

        System.out.println(result);
    }

    static class Solution {
        public int solution(String[][] clothes) {
            HashMap<String, Integer> hs = new HashMap<>();

            for (String[] clothe : clothes) {
                String type = clothe[1];
                hs.put(type, hs.getOrDefault(type, 0) + 1);
            }
            int mul = 1;

            for (Integer value : hs.values()) {
                mul *= (value + 1);
            }

            return mul - 1;
        }
    }
}
