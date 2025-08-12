import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] Croatia = {"dz=", "lj", "nj", "c=", "c-", "d-", "s=", "z="};
            
        String word = br.readLine();

        for (String alpha : Croatia) {
            word = word.replaceAll(alpha, " ");
        }

        System.out.println(word.length());
    }
}