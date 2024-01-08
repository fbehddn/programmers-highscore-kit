package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class notCompletedRace {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});

        System.out.println(result);
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {

        HashMap<Integer, String> mapP = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            mapP.put(i, participant[i]);
        }

        for (int i = 0; i < completion.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                if (completion[i].equals(mapP.get(j))) {
                    mapP.remove(j);
                    break;
                }
            }
        }

        for (String value : mapP.values()) {
            return value;
        }
        return null;
    }
}
