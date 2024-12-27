import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        
       int answer = 0;

        HashMap<Integer, Integer> result = new HashMap<>();
        int pickSize = nums.length/2;

        for (int i = 0; i < nums.length; i++) {
            if (!result.containsKey(nums[i])) {
                result.put(nums[i], 1);
            }
        }

        answer = result.size();

        if (result.size() > pickSize) {
            answer = pickSize;
        }

        return answer;

    }
}
