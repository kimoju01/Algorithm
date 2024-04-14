class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder(cipher.length());
        int i = code - 1;
        
        while (i < cipher.length()) {
            sb.append(cipher.charAt(i));
            i += code;
        }

        return sb.toString();
    }
}