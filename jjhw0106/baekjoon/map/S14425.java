package baekjoon.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class S14425 {
    void solution(ArrayList<String> s, ArrayList<String> checkList) {
        Map<String, Integer> mp = new HashMap<String, Integer>();
        int count =0;
        for (String word : s) {
            mp.put(word, 1);
        }

        for (String item : checkList) {
            if(mp.containsKey(item)){
                count++;
            }
        }
        System.out.println(count);
    }
}
