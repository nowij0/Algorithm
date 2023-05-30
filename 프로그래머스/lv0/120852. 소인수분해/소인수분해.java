import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        //HashSet: 중복 값 XXX
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) { //소인수를 구하기 위해 2부터 시작
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if (n != 1){
          set.add(n);  
        } 
        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}