class Solution {
    public long solution(long n) {
        long answer = 0;
        long squareRoot = (long)Math.sqrt(n);
        answer = (long)Math.pow(squareRoot + 1, 2);
        if(squareRoot * squareRoot == n){
            return answer;
        } else {
            return answer = -1;
        }
    }
}