class Solution {
    public String solution(String my_string) {

        StringBuilder sb = new StringBuilder(my_string.length());

        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch >= 'a' && ch <='z') {
                sb.append((char)(ch-32));
            } else {
                sb.append((char)(ch+32));
            }
        }
        return sb.toString();
    }
}