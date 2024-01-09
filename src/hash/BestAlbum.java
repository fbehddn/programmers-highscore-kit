package hash;

import java.util.Arrays;
import java.util.HashMap;

public class BestAlbum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"classic", "pop", "classic","classic", "pop"},
                            new int[]{500, 600, 150, 800, 2500});
    }

    static class Solution {
        public int[] solution(String[] genres, int[] plays) {
            /**
             * 가장 많이 들은 장르가 뭔지 구하는 로직만 짜면 끝
             */
            HashMap<String, Integer> temp = new HashMap<>();
            HashMap<Integer, String> temp2 = new HashMap<>();

            for (int i = 0; i < genres.length; i++) {
                temp.put(genres[i], temp.getOrDefault(genres[i], 0) + plays[i]);
                temp2.put(temp.getOrDefault(genres[i], 0) + plays[i], genres[i]);
            }

            HashMap<Integer, String> hm = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                hm.put(plays[i], genres[i]);
            }
            /**
             * classic 500 + 150 + 800
             * pop 600 + 2500
             * <classic, 1450>
             * <pop, 3100>
             *
             * pop 장르의 values가 더 크다는 로직...
             */
            int max = 0;
            String topPlayGenres = null;
            for (String s : temp.keySet()) {
                max = temp.get(s) > max ? temp.get(s) : max;
            }
            topPlayGenres = temp2.get(max);

            int[] result = new int[temp.size() * 2];
            int idx = 0;
            for (Integer integer : temp2.keySet()) {
                if (temp2.get(integer).equals(topPlayGenres)) {
                    result[idx++] =
                }
            }

        }
    }
}
