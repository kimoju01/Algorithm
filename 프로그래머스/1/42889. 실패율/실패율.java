import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] notClearUser = new int[N];
        int totalUser = stages.length;

        // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 구하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < totalUser; j++) {
                if (i + 1 == stages[j]) {
                    notClearUser[i]++;
                }
            }
        }

        // 스테이지 별 실패율 구하기
        HashMap<Integer, Double> failureRate = new HashMap<>();
        for (int i = 0; i < N; i++) {
            // ZeroDivisionError: division by zero 방지용으로 if 문 추가
            if (notClearUser[i] == 0) {
                failureRate.put(i, (double) 0);
                continue;
            }
            failureRate.put(i, (double) notClearUser[i] / totalUser);
            totalUser -= notClearUser[i];
        }

        // 실패율 높은 스테이지부터 내림차순으로 값 정렬
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(failureRate.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // 인덱스만 추출해서 int[] 만들기
        int[] sortedIndex = new int[N];
        for (int i = 0; i < N; i++) {
            sortedIndex[i] = list.get(i).getKey() + 1;
        }

        // 인덱스 출력하기
        return sortedIndex;
    }
}