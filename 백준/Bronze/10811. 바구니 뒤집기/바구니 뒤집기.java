import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = i + 1;
        }

        for(int i=0; i<m; i++){
            tokenizer = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(tokenizer.nextToken()) - 1;
            int b = Integer.parseInt(tokenizer.nextToken()) - 1;

            while (a < b){
                int tmp = result[a];
                result[a++] = result[b];
                result[b--] = tmp;
            }
        }

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}