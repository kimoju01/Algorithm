import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        int left = numbers[0] * numbers[1];
        int right = numbers[numbers.length-1] * numbers[numbers.length-2];
        if (left > right)
            answer = left;
        else
            answer = right;

        return answer;
    }
}