import java.util.*;

class Solution {
    public String solution(String my_string) {
        String smallStr = my_string.toLowerCase(); //문자열 소문자로 바꿔주고
        char[] charArr = smallStr.toCharArray(); //순서대로 정렬하기 위해서 char 배열로 바꿔주기
        Arrays.sort(charArr); 
        String result = String.valueOf(charArr); //다시 String으로 변환
        return result;
    }
}