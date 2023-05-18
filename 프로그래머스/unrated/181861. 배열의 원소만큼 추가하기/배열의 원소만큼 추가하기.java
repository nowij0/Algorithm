import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> temp = new ArrayList(); //arrayList로 배열 만들어서 값 넣어주고
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                temp.add(arr[i]);   
            }
        }
        //arrayList로 크기만큼 int[] 만들어서 get()으로 넣어주기
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
