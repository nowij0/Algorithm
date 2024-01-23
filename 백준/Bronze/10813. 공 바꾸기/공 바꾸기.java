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

        int[] basket = new int[n];
        for(int i=0; i<n; i++){
            basket[i] = i + 1;
        }

        int tmp = 0;
        for(int j=0; j < m; j++){
            tokenizer = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());

            tmp = basket[a - 1];
            basket[a-1] = basket[b-1];
            basket[b-1] = tmp;
        }

        for(int result : basket){
            System.out.print(result + " ");
        }
    }
}