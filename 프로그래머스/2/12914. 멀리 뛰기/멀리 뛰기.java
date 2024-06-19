class Solution {
    public long solution(int n) {
        // n[i] = n[i-1] + n[i-2]
        long answer = 0;
        int num = 1234567;
        int[] dp = new int[n+2];    
        // n+2인 이유는 n=1을 구하려면 dp[0], dp[1]가 필요하고 더한 결과를 저장할 dp[2]가 필요
        
        dp[0] = 0;
        dp[1] = 1;
        
        // n=1을 i=2로 지정 (n=1을 구하려면 n=0과 n=-1을 구해야하는데 그렇게 구할 수는 없으니)
        for (int i=2; i<dp.length; i++) {
            dp[i] = dp[i-1] % num  + dp[i-2] % num;
        }
            
        answer = dp[n+1];
        
        return answer % 1234567;
    }
}