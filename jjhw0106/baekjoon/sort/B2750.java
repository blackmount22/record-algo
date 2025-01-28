

package baekjoon.sort;

import java.util.*;

public class B2750 {
    public static int[] solution(int[] nums) {
            int target = nums[0];

            for (int i=0; i<nums.length; i++) {
                for(int j=i; j<nums.length; j++){
                    if(nums[i] > nums[j]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        return nums;
    }
}
