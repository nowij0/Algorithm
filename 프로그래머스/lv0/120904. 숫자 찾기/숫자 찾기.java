class Solution {
    public int solution(int num, int k) {
        String strNum = Integer.toString(num);
        String strK = Integer.toString(k);
        
        int answer = strNum.indexOf(strK);
        if(answer == -1){
            return answer;
        } else {
            return answer+1;   
        }
    }
}