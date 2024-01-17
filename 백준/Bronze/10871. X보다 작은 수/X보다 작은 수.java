import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());

        StringBuilder sb = new StringBuilder();
        tokenizer = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(tokenizer.nextToken());
            if(num < x){
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb);
    }
}