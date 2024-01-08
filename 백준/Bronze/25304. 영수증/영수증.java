import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sumPrice = Integer.parseInt(br.readLine());
        int size = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i=0; i<size; i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(tokenizer.nextToken());
            int cnt = Integer.parseInt(tokenizer.nextToken());
            sum += (price * cnt);
        }
        if(sumPrice == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}