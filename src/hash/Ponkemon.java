package hash;

import java.util.HashSet;

public class Ponkemon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3,3,3,2,2,4});

        System.out.println(result);
    }
    static class Solution {
        public int solution(int[] nums) {
            HashSet<Integer> hs = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
                hs.add(nums[i]);
            }
            if(hs.size()>nums.length/2) return nums.length / 2;
            return hs.size();
        }
    }
}


