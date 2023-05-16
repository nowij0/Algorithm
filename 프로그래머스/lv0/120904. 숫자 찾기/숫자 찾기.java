class Solution {
    public int solution(int num, int k) {
        //int 값 String으로 바꾸고, indexOf 사용
        String strNum = Integer.toString(num);
        String strK = Integer.toString(k);
        
        int answer = strNum.indexOf(strK);
        if(answer == -1){ //해당하는 값이 strNum에 없으면 -1을 반환
            return answer;
        } else { //indexOf는 index값 반환하니까 +1 해주기
            return answer + 1;   
        }
    }
}