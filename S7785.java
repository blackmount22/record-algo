package baekjoon.map;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class S7785 {
    static void solution(ArrayList<String> s) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeMap<String, String> mp = new TreeMap<String,String>();
        for (String word : s) {
            mp.put(word.split(" ")[0], word.split(" ")[1]);
        }

        for (Map.Entry<String,String> entry : mp.descendingMap().entrySet()) {
            if(entry.getValue().equals("enter")) {
                bw.write((entry.getKey()));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
