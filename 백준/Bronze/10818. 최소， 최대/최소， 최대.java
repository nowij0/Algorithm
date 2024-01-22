import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

        int idx = 0;
        int[] arr = new int[n];
        while (tokenizer.hasMoreTokens()){ //StringTokenizer 에 토큰이 남아있으면 true, 비어있으면 false를 반환
            arr[idx] = Integer.parseInt(tokenizer.nextToken());
            idx++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n-1]);
    }
}