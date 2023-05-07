class Solution {
    public String solution(String my_string) {
        String answer = "";
        char tmp;
        for(int i=0; i<my_string.length(); i++) {
            tmp = my_string.charAt(i);
            
            if(tmp >= 65 && tmp <= 90){
                answer += answer.valueOf(tmp).toLowerCase();
            } else if(tmp >= 97 && tmp <= 122) {
                answer += answer.valueOf(tmp).toUpperCase();
            }
        }
        return answer;
    }
}