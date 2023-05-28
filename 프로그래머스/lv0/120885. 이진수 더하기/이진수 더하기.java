class Solution {
    public String solution(String bin1, String bin2) {
        //2진수를 10진수로 바꿔서(parseInt사용) 더한다.
        int result = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(result); //String으로 변환
    }
}