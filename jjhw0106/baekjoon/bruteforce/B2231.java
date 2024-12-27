package baekjoon.bruteforce;

import java.util.ArrayList;
import java.util.Map;

public class B2231 {
    public int solution(int m) {
        for(int i=0; i<m; i++){
            if(i + sum(i, 0) == m){
                return i;
            }
        }
        return 0;
    }

    int sum(int m, int digitSum) {
        int remain = m%10;
        digitSum += remain;
        int n = m/10;
        if(m == 0){
            return digitSum;
        }
        return sum(n, digitSum);
    }

}
