class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);

        char temp = sb.charAt(num2);
        sb.setCharAt(num2, sb.charAt(num1));
        sb.setCharAt(num1, temp);

        return sb.toString();
    }
}