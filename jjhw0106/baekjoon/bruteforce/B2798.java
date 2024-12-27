package baekjoon.bruteforce;

public class B2798 {
    public int solution(int n, int m, int[] cards) {
        int sum = 0;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < n-2; i++) {
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    sum = cards[i] + cards[j] + cards[k];
                    if(sum <= m ) {
                        if (sum > max) {
                            max = sum;
                        }
                    }
                    if (max == m) {
                        return max;
                    }
                }
            }
            sum += cards[i];
        }
        return max;
    }
}
