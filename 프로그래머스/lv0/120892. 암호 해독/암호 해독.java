class Solution {
    public String solution(String cipher, int code) {
        String result = "";
        for(int i=code-1; i<cipher.length(); i+=code){
            char word = cipher.charAt(i);
            result += word;
        }
        return result;
    }
}