import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int[][] map;
    static int[][] visit;

    static int w;
    static int h;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> result = new ArrayList<>();

        while (true) {
            int answer = 0;

            w = sc.nextInt();
            h = sc.nextInt();

            map = new int[h][w];
            visit = new int[h][w];

            if(w == 0 && h == 0) break;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && visit[i][j] == 0) {
                        getDFS(i, j);
                        answer++;
                    }
                }
            }

            result.add(answer);
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static void getDFS(int x, int y){
        int[] xx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] yy = {0, 1, 1, 1, 0, -1, -1, -1};

        visit[x][y] = 1;

        for (int i = 0; i < 8; i++) {
            int ax = x + xx[i];
            int ay = y + yy[i];

            if (ax >= 0 && ay >= 0 && ax < h && ay < w) {
                if (map[ax][ay] == 1 && visit[ax][ay] == 0) {
                    getDFS(ax,ay);
                }
            }
        }
    }
}
