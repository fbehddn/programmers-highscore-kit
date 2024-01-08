package hash;

import java.util.Arrays;

public class notCompletedRace {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"leo"}, new String[]{});

        System.out.println(result);
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant); // e k l // f j m n v  // a m m s
        Arrays.sort(completion); // e k    // f j m n    // a m s

        int count = 0;

        if(completion.length==0) return participant[0];

        for (int i = 0; i < participant.length; i++) {
            if (participant[i].equals(completion[i])) {
                count++;
            }else{
                return participant[i];
            }
            if (count == completion.length) {
                return participant[participant.length - 1];
            }
        }

        return "test";
    }
}
