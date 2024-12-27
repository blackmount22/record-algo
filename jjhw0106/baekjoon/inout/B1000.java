package baekjoon.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1000 {
    int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        return Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
    }
}

