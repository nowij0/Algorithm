class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()){
            answer += Character.toLowerCase(c); //대문자를 소문자로
        }
        return answer;
    }
}