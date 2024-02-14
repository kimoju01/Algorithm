class Solution {
    public int solution(int n) {
        int sum = 0;
        while (n >= 2) {
            if (n % 2 == 0) {
                sum = sum + n;
                n = n - 2;
            }
            else {
                sum = sum + n - 1;
                n = n - 2;
            }
        }
        return sum;
    }
}