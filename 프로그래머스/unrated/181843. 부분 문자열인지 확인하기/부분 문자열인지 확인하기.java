class Solution {
    public int solution(String my_string, String target) {
        while(my_string.contains(target)){
            return 1;
        }
        return 0;
    }
}