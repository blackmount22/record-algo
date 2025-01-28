package baekjoon.sort;

import java.util.Arrays;

public class B25305 {
    static int solution(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[k];
    }
}
