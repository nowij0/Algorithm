import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        answer = set.size();
        if(answer > nums.length/2){
            return nums.length/2;
        } else {
            return answer;
        }
    }
}