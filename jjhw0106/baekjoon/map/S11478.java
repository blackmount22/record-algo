package baekjoon.map;

import java.io.*;
import java.util.HashSet;

public class S11478 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String getStr = br.readLine();
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < getStr.length(); i++) {
            for (int j = 0; j < getStr.length()-i; j++) {
                set.add(getStr.substring(i, i+j+1));
            }
        }
        System.out.println(set.size());

        bw.flush();
        bw.close();
    }
}
