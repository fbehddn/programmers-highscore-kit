package hash;

import java.util.HashSet;

public class ListOfPhone {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution(new String[]{"123", "456", "789"});

        System.out.println(result);
    }

    static class Solution {
        public boolean solution(String[] phone_book) {
            HashSet<String> hs = new HashSet<>();
            for (String s : phone_book) {
                hs.add(s.substring(0,1));
            }
            return hs.size() == phone_book.length;
        }
    }
}
