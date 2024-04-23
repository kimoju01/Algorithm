import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int maxLength = 0;
        for (int num : arr) {
            maxLength += num;
        }

        int[] answer = new int[maxLength];
        int idx = 0;
        for (int i=0; i<arr.length; i++) {
            Arrays.fill(answer, idx, idx + arr[i], arr[i]);
            idx += arr[i];
        }


        return answer;
    }
}