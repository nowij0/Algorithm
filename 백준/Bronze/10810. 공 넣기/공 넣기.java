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
        for(int i=0; i < m; i++){

            tokenizer = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());

            for(int j=a; j <= b; j++){
                basket[j - 1] = c;
            }
        }

        for(int result : basket){
            System.out.print(result + " ");
        }
    }
}