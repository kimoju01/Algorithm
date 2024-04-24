class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i=0; i<sb.length(); i++) {
            if (sb.charAt(i) == 'A') {
                sb.setCharAt(i, 'B');
            } else {
                sb.setCharAt(i, 'A');
            }
        }
        
        return sb.indexOf(pat, 0) >= 0 ? 1 : 0;
    }
}