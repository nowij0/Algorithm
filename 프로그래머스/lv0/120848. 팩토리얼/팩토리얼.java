class Solution {
    public int solution(int n) {
        
        int answer = 0;
        //제한 사항의 3,628,800은 10!이니까 이 값까지만 반복
        for(int i=0; i<= 10; i++){ 
            if(factorial(i) <= n){ //주어지는 값보다 작을 때만 팩토리얼 계산
                answer = i;
            }
        }
        return answer;
    }
    
    //팩토리얼 값 계산
    public int factorial(int n){
        return (n <= 1) ? n : factorial(n-1) * n;
    }
    
}
