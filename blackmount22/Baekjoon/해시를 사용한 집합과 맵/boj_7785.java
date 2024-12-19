import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String type = sc.next();

            if (type.equals("enter")) {
                map.put(name, 1);
            } else if (type.equals("leave")) {
                map.replace(name, map.get(name) - 1);
            }
        }

        /*
          사전 역순 출력을 위해 map 데이터를
          Treemap에 reverseOrder 처리 후 저장
        */
        TreeMap<String, Integer> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(map);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
