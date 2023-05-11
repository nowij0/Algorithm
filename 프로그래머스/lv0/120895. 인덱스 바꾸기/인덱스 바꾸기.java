class Solution {
    public String solution(String my_string, int num1, int num2) {  
        StringBuilder builder = new StringBuilder(my_string);
        
        char char1 = builder.charAt(num1);
        char char2 = builder.charAt(num2);
        
        builder.setCharAt(num1, char2);
        builder.setCharAt(num2, char1);
        
        return builder.toString();
    }
}