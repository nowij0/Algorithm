class Solution {
    public long solution(String numbers) {
        String[] engNum = {
                "zero", "one", "two", "three", "four", "five"
                , "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < engNum.length; i++) {
            numbers = numbers.replaceAll(engNum[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}