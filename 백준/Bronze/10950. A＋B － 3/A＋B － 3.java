import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< size; i++){
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(tokenizer.nextToken()) + Integer.parseInt(tokenizer.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}