import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result[] = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < result.length; i++) {
            result[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(result);

        for(int i = 0; i < result.length; i++) {
            sum += ((result[i] / result[result.length - 1]) * 100);
        }
        System.out.print(sum / result.length);
    }
}