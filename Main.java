import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] positions = new int[26];
        Arrays.fill(positions, -1);
        
        String word = br.readLine();
        for (int i=0; i<word.length(); i++) {
                char in = word.charAt(i);
                int index = in - 'a';

                if (positions[index] == -1) {
                    positions[index] = i;
                }
        }
        for (int i=0; i<positions.length; i++) {
            bw.write(positions[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}