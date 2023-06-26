class Solution {
    public int[] solution(int start, int end) {
        int answerLength = start - end + 1;
        int[] answer = new int[answerLength];
        for(int i=0; i<answerLength; i++){
            answer[i] = start--;
        }
        return answer;
    }
}