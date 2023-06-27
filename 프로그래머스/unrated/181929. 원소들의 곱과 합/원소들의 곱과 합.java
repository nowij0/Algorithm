import java.lang.Math;
    
class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int sumSquare = 0;
        for(int i=0; i<num_list.length; i++){
            multiply *= num_list[i];
            sumSquare += num_list[i];
        }
        sumSquare = (int)Math.pow(sumSquare, 2);
        return multiply < sumSquare ? 1 : 0;
    }
}