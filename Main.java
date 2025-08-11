import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            for (int j=0; j<N-i; j++) {
                bw.write(" ");
            }
            bw.write("*");
            for (int j=0; j<i-1; j++) {
                bw.write("**");
            }
            bw.newLine();
        }

        for (int i=2; i<=N; i++) {
            for (int j=0; j<i-1; j++) {
                bw.write(" ");
            }
            bw.write("*");
            for (int j=0; j<N-i; j++) {
                bw.write("**");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}