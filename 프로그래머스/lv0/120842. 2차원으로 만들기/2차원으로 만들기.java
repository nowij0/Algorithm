class Solution {
    public int[][] solution(int[] num_list, int n) {
        int column = num_list.length / n;
        int[][] answer = new int[column][n]; //2차원 배열 생성
        
        int num = 0; //num_list의 index값
        for(int i=0; i<column; i++){ //행만큼 반복
            for(int j=0; j<n; j++){ //열만큼 반복 
                answer[i][j] = num_list[num];
                num++; //num_list의 index 값 1씩 더해주기
            }
        }
        return answer;
    }
}
