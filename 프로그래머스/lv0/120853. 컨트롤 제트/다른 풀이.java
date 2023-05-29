import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>(); //스택 사용

        for (String w : s.split(" ")) { //공백 기준으로 잘라서 넣기
            if (w.equals("Z")) { 
                stack.pop(); //Z 를 만나면 스택에서 빼기
            } else {
                stack.push(Integer.parseInt(w)); //그 외에는 변환해서 스택에 넣기
            }
        }
        for (int i : stack) {
            answer += i; //스택에 있는 값 더하기
        }
        return answer;
    }
}
