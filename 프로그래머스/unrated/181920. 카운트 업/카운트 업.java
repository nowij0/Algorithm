import java.util.*;

class Solution {
    public List solution(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for(int i=start; i<end+1; i++){
            list.add(i);
        }
        return list;
    }
}