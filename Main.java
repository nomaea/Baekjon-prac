import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[9];

        for (int i=0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
        }

        int max = numbers[0];
        int count = 1;
        for (int i = 0; i<numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
                count = i+1;
            }
        }

        bw.write(max + "\n" + count);

        bw.flush();
        bw.close();
        br.close();
    }
}