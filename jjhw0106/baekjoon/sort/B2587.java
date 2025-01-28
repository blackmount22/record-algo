package baekjoon.sort;

import java.util.Arrays;

public class B2587 {
    static int[] solution(int[] nums) {

        int avg = Arrays.stream(nums).sum()/nums.length;
        Arrays.sort(nums);
        int middle = nums[nums.length/2];

        return new int[]{avg, middle};
    }
}
