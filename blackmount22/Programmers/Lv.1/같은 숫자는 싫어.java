import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<arr.length;i++) {
            if (i == 0) {
                q.add(arr[i]);
            } else if (arr[i] != arr[i - 1]) {
                q.add(arr[i]);
            }
        }
        
        int[] answer = new int[q.size()];
        int idx = 0;
        
        for(int num : q) {
            answer[idx] = num;
            idx++;
        }

        return answer;
    }
}
