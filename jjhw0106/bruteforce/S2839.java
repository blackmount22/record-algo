package baekjoon.bruteforce;

public class S2839 {
    int solution(int n) {
        int min = -1;
        for (int i=0; i<=n/5; i++){
            for (int j = 0; j <= n / 3; j++) {
                if(5*i + 3*j == n){
                    min = i+j;
                }
            }
        }
        return min;
    }
}
