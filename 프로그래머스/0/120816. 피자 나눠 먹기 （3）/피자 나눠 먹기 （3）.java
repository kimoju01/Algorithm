class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

        while (n > 0) {
            answer++;
            n = n - slice;
        }

        return answer;
    }
}