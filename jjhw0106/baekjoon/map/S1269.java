package baekjoon.map;

import java.io.*;
import java.util.HashMap;

public class S1269 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String[] setA = br.readLine().split(" ");
        String[] setB = br.readLine().split(" ");

        int sum = setA.length + setB.length;

        HashMap<String, String> mp = new HashMap<>();
        for (String s : setA) {
            mp.put(s, "o");
        }
        int count = 0;
        for (String s : setB) {
            if (mp.get(s) != null) {
                count ++;
            }
        }
        bw.write(String.valueOf(sum-count*2));
        bw.flush();
        bw.close();
    }
}

