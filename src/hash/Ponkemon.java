package hash;

import java.util.HashMap;

public class Ponkemon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3,3,3,2,2,4});

        System.out.println(result);
    }
    static class Solution {
        public int solution(int[] nums) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            /**
             * 중복된 숫자는 빼고 nums.length/2 만큼 뽑기
             */
            int idx = 0;
            int count = 0;
            while (true) {
                // 포함하고 있지 않으면
                if (!hm.containsKey(nums[idx])) {
                    hm.put(nums[idx], nums[idx]);
                    count++;
                }
                idx++;
                if (count == nums.length / 2 || idx == nums.length) break;
            }
            return hm.size();
        }
    }
}


