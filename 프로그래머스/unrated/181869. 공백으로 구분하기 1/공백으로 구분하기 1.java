class Solution {
    public String[] solution(String my_string) {
        int cnt = (int)my_string.chars().filter(e->e == ' ').count();
        String[] answer = new String[cnt];   
        if(cnt == 0){
            answer = new String[]{my_string};
            return answer;
        } 
        for(int i=0; i<answer.length; i++){
            answer = my_string.split(" ");
        }
        return answer;
    }
}