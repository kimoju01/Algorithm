import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        answer = (int) Arrays.stream(array)
                .filter(n -> n > height)
                .count();
        return answer;
    }
}