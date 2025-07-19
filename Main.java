import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];    

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            numbers[i] = num;
        }

        int min = numbers[0], max = numbers[0];
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        bw.write(min + " " + max);

        bw.flush();
        bw.close();
        br.close();
    }
}