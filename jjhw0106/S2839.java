package baekjoon.bruteforce;

public class S2839 {
    int solution(int n) {
        int a = n/5;
        int b = n/3;
        int min = a+b;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if(5*i + 3*j == n){
                    if((i + j)<min){
                        min = i + j;
                    }
                }
            }
        }
        if(min == a+b) {return -1;}
        else {return min;}
    }
}
