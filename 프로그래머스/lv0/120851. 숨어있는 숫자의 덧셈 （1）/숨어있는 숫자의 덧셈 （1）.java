class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        String[] strArr = new String[str.length()];
        strArr = str.split("");
        
        for(int i=0; i<strArr.length; i++){
            answer += Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}