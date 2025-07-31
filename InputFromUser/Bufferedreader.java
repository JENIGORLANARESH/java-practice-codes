package InputFromUser;
import java.io.*;

public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number :");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int num = Integer.parseInt(br.readLine());
        System.out.println(num);
    }
}
