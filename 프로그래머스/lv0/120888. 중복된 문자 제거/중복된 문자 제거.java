class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            //indexOf는 앞에서부터 **처음** 발견되는 인덱스를 반환
            //뒤에 나오는 중복값을 거르는 역할을 한다. 
            if(my_string.indexOf(my_string.charAt(i)) == i){
                //indexOf가 반환하는 인덱스와 현재 인덱스가 같아야만 중복이 아니기에 
                //같을 때만 answer에 더해준다.
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}