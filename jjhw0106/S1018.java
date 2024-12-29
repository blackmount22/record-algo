package baekjoon.bruteforce;

//start = W
//for 세로
//	for 가로
//		if 세로 + 가로가 짝수
//			if target !== start?
//count1++

//8 8
//WBWBWBWB
//        BWBWBWBW
//WBWBWBWB
//        BWBBBWBW
//WBWBWBWB
//        BWBWBWBW
//WBWBWBWB
//        BWBWBWBW
public class S1018 {

    public int solution(int n, int m, String[][] maps) {
        String start = "W";
        int count1 = 0;
        int count2 = 0;

        int min1 = 20000;
        int min2 = 20000;
        for (int y=0; y < n-7; y++){
            for(int x=0; x < m-7; x++){
                count1 = 0;
                count2 = 0;
                for (int i = y; i < y+8; i++) {
                    for (int j = x; j < x+8; j++) {
                        if ((i + j) % 2 == 0) {
                            if(!maps[i][j].equals("W")){
                                count1++;
                            }
                            if(!maps[i][j].equals("B")){
                                count2++;
                            }
                        } else if((i+j)%2==1){
                            if(maps[i][j].equals("W")){
                                count1++;
                            }
                            if(maps[i][j].equals("B")){
                                count2++;
                            }
                        }
                    }
                }
                if(count1 < min1) { min1 = count1; }
                if(count2 < min2) { min2 = count2; }
            }
        }
        return Math.min(min1, min2);
    }
}
