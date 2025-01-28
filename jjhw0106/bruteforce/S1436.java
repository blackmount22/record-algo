package baekjoon.bruteforce;

public class S1436 {
    int solution (int n) {
        int count = 0;
        int cur = 0;
        while(true) {
            if(count == n) {
                break;
            }
            cur++;
            if(String.valueOf(cur).contains("666")){
                count ++;
            }
        }
        return cur;
    }
}
