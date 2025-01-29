package baekjoon.map;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class S1620 {
    static void solution(ArrayList<String> list, ArrayList<String> problem) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, String> mp = new HashMap<Integer, String>();
        HashMap<String, Integer> reverseMap = new HashMap<String, Integer>();

        int index=1;

        for (String word : list) {
            mp.put(index, word);
            reverseMap.put(word, index);
            index++;
        }

        for (String s : problem) {
            if(isNumeric(s)) {
                bw.write(mp.get(Integer.parseInt(s)));
                bw.newLine();
            } else {
                bw.write(String.valueOf(reverseMap.get(s)));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }

    static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
