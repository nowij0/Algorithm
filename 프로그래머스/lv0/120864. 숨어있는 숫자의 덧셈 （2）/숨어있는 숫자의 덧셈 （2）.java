class Solution {
        public int solution(String my_string) {
        //정규식 사용해서 대,소문자 기준으로 잘라 배열에 넣기
        String[] stringArray = my_string.split("[a-zA-Z]");
        int answer = 0;
        for (String value : stringArray) {
            answer += value.isEmpty() ? 0 : Integer.parseInt(value);
        }
        return answer;
    }
}