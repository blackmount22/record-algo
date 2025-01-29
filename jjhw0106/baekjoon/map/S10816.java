package baekjoon.map;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class S10816 {
    static void solution(ArrayList<Integer> have, ArrayList<Integer> checkList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        StringBuilder sb = new StringBuilder();
        for (Integer i : have) {
            if(mp.get(i) == null){
                mp.put(i,1);
            } else {
                mp.put(i, mp.get(i)+1);
            }
        }
        int index=0;
        for (Integer i : checkList) {
            if(mp.get(i)==null){
                sb.append("0");
            } else{
                sb.append(String.valueOf(mp.get(i)));
            }
            if (index < checkList.size()-1){
                sb.append(" ");
                index++;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
