class Solution {
    public int solution(int n) {
        for (int i=1; i<=1000; i++) {   // 100만은 1000x1000
            if ((i*i) == n) {
                return 1;
            }
        }
        return 2;
    }
}