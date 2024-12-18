public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) +1);
        }

        for (int j = 0; j < completion.length; j++) {
            String key = completion[j];
            map.replace(key, map.get(key) -1);
        }

        //System.out.println(" answer : " + map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey());
        answer = map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();

        /*
        map.entrySet()에서 Map의 모든 엔트리를 가져옵니다.
        .stream()을 통해 스트림 연산을 시작합니다.
        .filter(e -> e.getValue() == 1)로 값이 1인 엔트리만 필터링합니다.
        .findFirst()로 조건을 만족하는 첫 번째 엔트리를 찾습니다.
        .get()으로 Optional에서 실제 엔트리를 꺼냅니다.
        .getKey()로 해당 엔트리의 키를 반환합니다.
        */
      
        return answer;
    }
