class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = s.split(" "); //공백 기준으로 자르기
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals("Z")){ //Z를 만나면 직전 값을 빼주기
                answer -= Integer.parseInt(strArr[i-1]);
                continue;
            }
            answer += Integer.parseInt(strArr[i]);
            
        }
        return answer;
    }
}