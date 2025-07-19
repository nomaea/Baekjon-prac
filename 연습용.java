import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class 연습용{

    static void func1() {
        System.out.println("안녕하세요");
    }

    static void func2753() {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        
        if ((y%4 == 0 && y%100 != 0) || (y%400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        in.close();
    }

    static void func14681() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x >= 0 && y >= 0) {
            System.out.println(1);
        }
        else if (x <= 0 && y >= 0) {
            System.out.println(2);
        }
        else if (x <= 0 && y <= 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
        in.close();
    }

    static void func2884() {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), m = in.nextInt();

        if (m < 45 && h > 1) {
            System.out.println((h-1) + " " + (m-45+60));
        } 
        else if (m < 45 && h < 1) {
            System.out.println((h-1+24) + " " + (m-45+60));
        }
        else {
            System.out.println(h + " " + (m-45));
        }
        in.close();
    }

    static void func2525() {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), m = in.nextInt();
        int plus_m = in.nextInt();
        int n = (m + plus_m) / 60;

        if (m + plus_m >= 60 && h+n < 24) {
            h = h + n;
            m = (m + plus_m) % 60;
        }
        else if (m + plus_m >= 60 && h+n >= 24) {
            h = h + n -24;
            m = (m + plus_m) % 60;
        } else {
            m = m + plus_m;
        }

        System.out.println(h + " " + m);
        in.close();
    }

    static void func2480() {
        Scanner in = new Scanner(System.in);
        int dice1 = in.nextInt(), dice2 = in.nextInt(), dice3 = in.nextInt();
        int award = 0;
        if (dice1 == dice2 && dice2 == dice3) {
            award = 10000 + (dice1 * 1000);
        }
        else if (dice1 == dice2 || dice1 == dice3) {
            award = 1000 + (dice1 * 100);
        }
        else if (dice3 == dice2) {
            award = 1000 + (dice2 * 100);
        }
        else if (dice1 > dice2 && dice1 > dice3) {
            award = dice1 * 100;
        }
        else if (dice2 > dice1 && dice2 > dice3) {
            award = dice2 * 100;
        }
        else if (dice3 > dice1 && dice3 > dice2) {
            award = dice3 * 100;
        }

        System.out.println(award);
        in.close();
    }

    static void func2480repac() {
        Scanner in = new Scanner(System.in);
        int dice1 = in.nextInt(), dice2 = in.nextInt(), dice3 = in.nextInt();
        int award = 0;
        if (dice1 == dice2 && dice2 == dice3) {
            award = 10000 + (dice1 * 1000);
        }
        else if (dice1 == dice2 || dice1 == dice3) {
            award = 1000 + (dice1 * 100);
        }
        else if (dice3 == dice2) {
            award = 1000 + (dice2 * 100);
        } else {
            award = Math.max(dice1, Math.max(dice2, dice3)) * 100;
        }

        System.out.println(award);
        in.close();
    }

    static void func2739() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i=1; i<=9; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }

    static void func10950() {
        Scanner in = new Scanner(System.in);
        int lin = in.nextInt();
        int[] results = new int[lin];

        for(int i=0; i<lin; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            results[i] = A + B;
        }
        
        for(int i=0; i<lin; i++) {
            System.out.println(results[i]);
        }
        
    }

    static void func8393() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void func25304() {
        Scanner in = new Scanner(System.in);
        int total_price = in.nextInt();
        int type_num = in.nextInt();
        // int[] object = new int[type_num];
        int sum = 0;

        for (int i=0; i<type_num; i++) {
            int price = in.nextInt(), count = in.nextInt();
            sum += price * count;
        }

        if (total_price == sum) {
            System.out.println("Yes");
        } else {System.out.println("No");}
    }

    static void func25314() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String leng = "long ";

        for (int i=1; i<(N/4); i++) {
            leng += ("long ");
        }

        System.out.println(leng + "int");
    }

    static void func15552() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] results = new int[N];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
            results[i] = A + B;
        }

        for (int i=0; i<N; i++) {
            bw.write(results[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void func11021() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] results = new int[N];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
            results[i] = A + B;
        }

        for (int i=0; i<N; i++) {
            bw.write("Case #" + (i+1) + ": " +results[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void func11022() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
            int sum = A + B;

            bw.write("Case #" + (i + 1) + ": " + A + " + " + B + " = " + sum + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void func2438() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        for (int i=1; i<=N; i++) {
            for (int j=0; j<i; j++) {
            bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void func2439() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            for (int j=0; j<N-i; j++) {
                bw.write(" ");
            }
            for (int j=0; j<i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static void func10952() throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) break;

            bw.write((A + B) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 벨로그에 "EOF" 관련 작성 예정
    static void func10951() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());

            bw.write((A+B) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 벨로그에 작성 예정 ( ":" 사용 순회 )
    static void func10807() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 배열의 길이 지정
        int[] numbers = new int[N]; // 배열 생성

        StringTokenizer st = new StringTokenizer(br.readLine());    // 공백 기준으로 정수 입력 처리
        for (int i=0; i< N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());  // 배열에 입력
        }

        int v = Integer.parseInt(br.readLine());    // 찾으려는 정수

        int count = 0;  // 찾으려는 정수v 개수 찾기
        for (int num : numbers) {   // ":" 사용 배열 내부의 원소를 하나씩 순회하며 num에 저장
            if (num == v) count++;  // 순회하는 동안 num의 원소 값이 찾으려는 정수v와 일치하면 count값 1 증가
        }

        System.out.println(count);

        bw.flush();
        bw.close();
        br.close();
    }

    // 벨로그에 작성 예정 ( 토큰 파싱 방식 관련 예문이나 예제 추가로 찾아서 기입 )
    static void func10871() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());    // N, X 의 값을 받기 위한 토큰 할당

        int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());    // nums의 값을 받기 위한 새 st 재할당

        int idx = 0;    // 조건에 맞는 정수만 입력 받기 위한 변수 선언
        for (int i=0; i<N; i++) {
            int nums = Integer.parseInt(st.nextToken());    // st 재할당을 통한 nums 입력, 이때 기존 N, X의 값은 소멸됨
            if (nums < X) {
                numbers[idx++] = nums;  // nums의 값이 X 보다 작을 경우만 인덱스늘 하나 씩 늘려가며 요소 저장
            }
        }
        
        for (int i=0; i<idx; i++) {
            bw.write(numbers[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    //  Arrays.stream()은 실행 성능 관점에서 다양한 객체와 메모리를 사용하기 때문에 반복문에 비해 비효율적이다
    static void func10818() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];    

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            numbers[i] = num;
        }

        int min = numbers[0], max = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        bw.write(max + " " + min);

        bw.flush();
        bw.close();
        br.close();
    }

    

    public static void main(String[] args) throws IOException{
        func10818();
    }
}