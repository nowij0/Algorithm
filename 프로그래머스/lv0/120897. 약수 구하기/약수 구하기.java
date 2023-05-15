import java.util.*;

class Solution {
    public int[] solution(int n) {
        double sqrt = Math.sqrt(n);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                if (Math.pow(i, 2) == n) {
                    list.add(i);
                } else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}