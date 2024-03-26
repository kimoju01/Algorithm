class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        int y = n;
        
        while (x <= y) {
            if (n % x == 0)
                answer++;
            x++;
        }
        return answer;
    }
}