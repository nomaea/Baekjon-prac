import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashSet;

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

    static void func2562() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[9];

        for (int i=0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
        }

        int max = numbers[0];
        int count = 0;
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

    static void func10810() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[] bag = new int[N]; // N개의 바구니 생성

        for (int n=0; n<M; n++) {
            st = new StringTokenizer(br.readLine());    // 토큰 재할당
            int i = Integer.parseInt(st.nextToken()), j = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            for (int m=i; m<=j; m++) {
                bag[m-1] = k;   // i 부터 j 번째 배열에 k 값 저장
            }
        }

        for (int i=0; i<N; i++) {
            bw.write(bag[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 배열을 통한 계산에 있어서 위치 더블체크 중요
    static void func10813() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for (int i=0; i<N; i++) {
            basket[i] = i+1;
        }

        for (int n=0; n<M; n++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1, j = Integer.parseInt(st.nextToken()) - 1;
            
            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for (int i=0; i<N; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void func5597() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] stu_num = new boolean[31];


        for (int i=0; i<28; i++) {
            int n = Integer.parseInt(br.readLine());
            stu_num[n] = true;
        }

        for (int i=1; i<=30; i++) {
            if(!stu_num[i]) {   // !stu_num[i] 은 오른쪽과 같은 의미 stu_num[i] == false
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // JAVA의 자료구조 중 Set 활용 (중복 없는 자료구조)
    static void func3052() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        int[] split = new int[10];

        for (int i=0; i<10; i++) {
            split[i] = num[i] % 42;
        }
        */

        Set<Integer> split = new HashSet<>();

        for (int i=0; i<10; i++) {
            int N = Integer.parseInt(br.readLine());
            split.add(N%42);
        }

        bw.write(split.size() + "\n");  // BufferedWriter 사용 시 write로 출력 시 "입력된 정수의 하위 16비트를 유니코드 문잘호 해석해서 단일 문자로 출력하므로" write(int) 는 "정수출력" X, "문자 출력"
        // 때문에 문자열 반환이 필요하다

        bw.flush();
        bw.close();
        br.close();
    }    

    static void func10811() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        
        for (int i=0; i<N; i++) {
            basket[i] = i+1;
        }

        // int count = 0;
        for (int a=0; a<M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1, j = Integer.parseInt(st.nextToken()) - 1;
                /*  for (int b=i; b>=j; b++) {
                    int num = basket[b];
                    basket[b] = basket[j-count];
                    count++;
                }   */
               while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] =temp;
                i++;
                j--;
            }
        }

        for (int i=0; i<N; i++) {
            bw.write(basket[i] + " ");
        }
    
        bw.flush();
        bw.close();
        br.close();
    } 

    static void func1546() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            score[i] = num;
        }

        int max = score[0];

        for (int i=1; i<score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        double sum = 0;

        for (int i=0; i<N; i++) {
            double split = (double)score[i] / max * 100;
            sum += split;            
        }

        double avg = sum / N;

        bw.write(avg + "\n");
    
        bw.flush();
        bw.close();
        br.close();
    }

    static void func27866() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String word = br.readLine();
        char[] wordArray = word.toCharArray();

        int N = Integer.parseInt(br.readLine());

        bw.write(wordArray[N-1]);

        bw.flush();
        bw.close();
        br.close();
    }

    static void func2743() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String word = br.readLine();
        char[] wordArray = word.toCharArray();

        bw.write(wordArray.length + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static void func9086() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Case = Integer.parseInt(br.readLine());

        
        for (int i=0; i<Case; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();

            bw.write(word.charAt(0));
            bw.write(word.charAt(word.length()-1) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void func11654() throws IOException{
        int n = System.in.read();
        System.out.println(n);
    }

    static void func11720() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum=0;

        for (int i=0; i<N; i++) {
            char digitChar = num.charAt(i);
            int realnum = digitChar - '0';
            sum += realnum;
        }

        System.out.println(sum);

        br.close();
    }

    static void func10809() throws IOException{
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

    public static void main(String[] args) throws IOException{
        func10809();
    }
}