import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        int h = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int calcMin = 45 - m;
        String result = "";
        if(calcMin > 0){
            if(h != 0){
                h = h -1;
            } else {
                h = 23;
            }
            m = 60 - calcMin;
        } else if(calcMin < 0){
            m = Math.abs(calcMin);
        } else {
            m = 0;
        }
        result = h + " " + m;
        System.out.println(result);
    }
}