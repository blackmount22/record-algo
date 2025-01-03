// 토마토 문제
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TomatoLocation {
    int x;
    int y;

    public TomatoLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int m;
    static int n;
    static int[][] map;
    static int[][] visit;

    static int answer = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        map = new int[n][m];
        visit = new int[n][m];

        Queue<TomatoLocation> q = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) {
                    q.offer(new TomatoLocation(i, j));
                }
            }
        }

        while (!q.isEmpty()) {
            int[] xx = {-1, 0, 1, 0};
            int[] yy = {0, 1, 0, -1};

            int size = q.size();

            for (int i = 0; i < size; i++) {
                int x = q.peek().x;
                int y = q.poll().y;

                visit[x][y] = 1;

                for (int j = 0; j < 4; j++) {
                    int ax = x + xx[j];
                    int ay = y + yy[j];

                    if (ax >= 0 && ay >= 0 && ax < n && ay < m) {
                        if (visit[ax][ay] == 0 && map[ax][ay] == 0) {
                            map[ax][ay] = 1;
                            q.offer(new TomatoLocation(ax, ay));
                        }
                    }
                }
            }

            answer++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) answer = -1;
            }
        }

        System.out.println(answer);
    }
}
