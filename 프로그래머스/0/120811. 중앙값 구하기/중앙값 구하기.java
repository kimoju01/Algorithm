import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int midIdx = array.length / 2;
        
        return array[midIdx];
    }
}