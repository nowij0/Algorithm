import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        String surprised = "??!";
        
        System.out.println(id + surprised);
        scanner.close();
    }
}