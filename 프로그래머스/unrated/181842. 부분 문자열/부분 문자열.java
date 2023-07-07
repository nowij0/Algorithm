class Solution {
    public int solution(String str1, String str2) {
        while(str2.contains(str1)){
            return 1;
        }
        return 0;
    }
}