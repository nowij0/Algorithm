class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        //오른쪽으로 한 명 건너뛰니까 2씩 증가, 처음 공 던지는 사람은 0번 이니까 k-1
        answer = numbers[(2 * (k-1)) % numbers.length];
        return answer;  
    }
}