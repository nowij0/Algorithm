class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<= 10; i++){
            if(factorial(i) <= n){
                answer = i;
            }
        }
        return answer;
    }
    
    public int factorial(int n){
        return (n <= 1) ? n : factorial(n-1) * n;
    }
    
}