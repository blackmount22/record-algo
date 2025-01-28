package baekjoon.search;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class S10815 {
    static void solution(int[] have, int[] target) throws IOException {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Arrays.sort(have);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int element : target) {
            bw.write(binarySearch(have, element)+" ");
        }
        bw.flush();
        bw.close();
    }

    static int binarySearch(int[] have, int element) {
        int left = 0;
        int right = have.length-1;
        int middle = (left + right)/2;
        while (left <= right) {
            if (element < have[middle]) {
                right = middle - 1;
                middle = (left+right)/2;
            } else if (element > have[middle]) {
                left = middle + 1;
                middle = (left+right)/2;
            } else if (element == have[middle]) {
                return 1;
            }
        }
        return 0;
    }
}
