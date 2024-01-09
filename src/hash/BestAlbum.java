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
            HashMap<String, Integer> hs = new HashMap<>();
            HashMap<String, Integer> hs2 = new HashMap<>(); //원본

            for (int i = 0; i < genres.length; i++) {
                hs.put(genres[i], hs.getOrDefault(genres[i], 0) + plays[i]);
                hs2.put(genres[i], plays[i]);
            }
            // hs 의 value 가 큰 순서대로 key 를 담는 배열 생성

            // 배열을 이용해 hs2에서 큰 값부터 인덱스번호 담기

            return null;
        }
    }
}
