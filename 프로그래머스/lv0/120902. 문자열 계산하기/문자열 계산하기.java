class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        
        //첫 번째 값 계산
        answer += Integer.parseInt(strArr[0]);
        
        for(int i=1; i < strArr.length - 1; i++){
            if(strArr[i].equals("+")){
                answer += Integer.parseInt(strArr[i + 1]);
            }
            if(strArr[i].equals("-")){
                answer -= Integer.parseInt(strArr[i + 1]);
            }
        }
        return answer;
    }
}