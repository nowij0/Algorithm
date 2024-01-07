import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        int c = Integer.parseInt(tokenizer.nextToken());

        int result = 0;
        if( a != b && b != c && c != a){ //모든 숫자가 같지 않을 때
            int max = 0;
            if(a > b){
                if (c > a) {
                    max = c;
                }
                else {
                    max = a;
                }
            } else {
                if (c > b) {
                    max = c;
                }
                else {
                    max = b;
                }
            }
            result = max * 100;
        } else if(a == b && b == c && c == a ) { //모든 숫자가 같을 때
            result = 10000 + (a * 1000);
        }else{ //두 개의 숫자가 같을 때
            int sameNum = 0;
            if(a == b && b != c){
                sameNum = a;
            } else if(b == c && c != a){
                sameNum = b;
            } else {
                sameNum = c;
            }
            result = 1000 + (sameNum * 100);
        }
        System.out.println(result);
    }
}