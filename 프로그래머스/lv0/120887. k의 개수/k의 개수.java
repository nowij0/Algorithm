class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        for(int a=i; a<=j; a++){ //i부터 j까지 값
            String strA = String.valueOf(a); 
            if(strA.contains(strK)){ 
                //strA에 k가 두 번 들어갈 수 있으니 잘라서 카운트하기
                String[] array = strA.split("");
                for(int b=0; b<array.length; b++){
                    if(array[b].equals(strK)){
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }

}