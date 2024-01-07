package hash;

import java.util.HashMap;
import java.util.Scanner;

public class notCompletedRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> mapP = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            mapP.put(i, sc.next());
        }

        String[] c = new String[mapP.size() - 1];

        for (int i = 0; i < mapP.size() - 1; i++) {
            c[i] = sc.next();
        }

        /**
         * 1. remove 시 index 에 변동이 생김..
         * 2. map size 가 즉각 변동되어 for 문이 끝까지 돌지 않음
         * => map 하나를 똑같이 복사?
         */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (c[i].equals(mapP.get(j))) {
                    mapP.remove(j);
                    break;
                }
            }
        }

        for (String value : mapP.values()) {
            System.out.println(value);
        }
    }
}
