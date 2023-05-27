import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(""); //배열에 넣어두기
        Arrays.sort(str);
        
        int count = 0;
        for(int i=0; i<str.length; i++){ 
            count = 0; //카운트 1인 값 찾으면, 초기화 
            for(int j=0; j<str.length; j++){
                if(str[i].equals(str[j])){ 
                    count++; //첫 번째 문자가 문자열에서 몇 번 나오는지 카운트
                }
            }
            if(count == 1){ //카운트가 1이면 정답에 저장 
                answer += str[i];
            }
        }
        return answer;
    }
}