import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        StringTokenizer st = new StringTokenizer(word);

        System.out.println(st.countTokens());   // countTokens() 메소드: 토큰의 개수를 바로 출력

        br.close();
    }
}