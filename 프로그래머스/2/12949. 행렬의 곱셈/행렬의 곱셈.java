class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length; // arr1의 행 갯수
        int col1 = arr1[0].length;  // arr1의 열 갯수
        int row2 = arr2.length;
        int col2 = arr2[0].length;

        int[][] answer = new int[row1][col2];   // arr1의 행의 갯수가 answer의 행의 갯수가 된다.

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {    // arr1의 행열 (i * k) * arr2의 행열 (k * j) = i * j
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}