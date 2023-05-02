class Solution {
    public int solution(int n) {
        int answer = 0;
        int square = (int)Math.sqrt(n);
        if(n == (int)Math.pow(square, 2)){
            answer = 1;
        } else {
            answer = 2;
        }      
        return answer;
    }
}