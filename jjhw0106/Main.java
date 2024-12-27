//import baekjoon.bruteforce.B2231;
import baekjoon.bruteforce.B2798;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        B1000 problem = new B1000();
        System.out.println(problem.solution());
    }
}
class B1000 {
    int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        return Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
    }
}
