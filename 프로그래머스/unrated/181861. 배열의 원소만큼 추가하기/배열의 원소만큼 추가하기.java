import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> temp = new ArrayList();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                temp.add(arr[i]);   
            }
        }
        
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}