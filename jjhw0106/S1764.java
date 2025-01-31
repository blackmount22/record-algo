package baekjoon.map;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S1764 {
    static public void solution(ArrayList<String> dumb) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        HashMap<String, Boolean> dumbs = new HashMap<String, Boolean>();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            dumbs.put(br.readLine(), true);
        }
        for (int i = 0; i < m; i++) {
            String result = br.readLine();
            if(dumbs.get(result) != null){
                count ++;
                list.add(result);
            }
        }
        sb.append(String.valueOf(count));
        sb.append('\n');
        Collections.sort(list);
        for (String s : list) {
            sb.append(s);
            sb.append('\n');
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}