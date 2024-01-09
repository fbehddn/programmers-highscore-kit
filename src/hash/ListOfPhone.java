package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ListOfPhone {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution(new String[]{"12", "123", "1235", "567", "88"});

        System.out.println(result);
    }

    static class Solution {
        public boolean solution(String[] phone_book) {
            HashMap<Integer, String> hm = new HashMap<>();
            Arrays.sort(phone_book); // 12 123 1235 567 88 => 무조건 뒤 인덱스가 앞 인덱스 값으로 시작하는지 판단할 수 있게 정렬

            for (int i = 0; i < phone_book.length; i++) {
                hm.put(i, phone_book[i]);
            }

            for (int i = 1; i < hm.size(); i++) {
                if(hm.get(i).startsWith(hm.get(i-1))) return false;
            }
            return true;
        }
    }
}
