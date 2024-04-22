class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int gong = 0;
        if ((common[1] - common[0]) == (common[2] - common[1])) {
            gong = common[1] - common[0];
            answer = common[common.length-1] + gong;
        } else {
            gong = common[1] / common[0];
            answer = common[common.length-1] * gong;
        }
        
        return answer;
    }
}