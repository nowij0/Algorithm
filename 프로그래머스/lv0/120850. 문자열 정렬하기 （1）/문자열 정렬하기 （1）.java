import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String intArr = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[intArr.length()];
        for(int i=0; i<intArr.length(); i++){
            answer[i] = intArr.charAt(i) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}