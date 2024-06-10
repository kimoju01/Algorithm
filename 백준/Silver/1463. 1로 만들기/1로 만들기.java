import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        // dp[i] : i를 1로 만드는데 필요한 최소 연산 횟수
        dp[1] = 0;  // 1은 이미 1이므로 연산이 필요없음

        for (int i = 2; i <= n; i++) {
            // 기본적으로 i에서 1을 빼는 경우 (dp[i-1])
            dp[i] = dp[i - 1] + 1;
            
            // i가 2로 나누어 떨어지면, 2로 나누는 경우 (dp[i/2])
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            
            // i가 3으로 나누어 떨어지면, 3으로 나누는 경우 (dp[i/3])
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}
