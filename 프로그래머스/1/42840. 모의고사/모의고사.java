import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[][] student = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] scores = {0, 0, 0};

        for (int i=0; i<student.length; i++) {
            for (int j=0; j<answers.length; j++) {
                if (answers[j] == student[i][j % student[i].length])
                    scores[i]++;
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();
        for (int i=0; i<scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}