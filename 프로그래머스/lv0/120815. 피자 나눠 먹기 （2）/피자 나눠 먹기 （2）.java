class Solution {
    public static int solution(int n) {
        int answer = 0;
        answer = n * 6 / gcd(n, 6);
        return answer / 6;
    }
	
	public static int gcd(int a, int b) {
		if(b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        } 
	}
}