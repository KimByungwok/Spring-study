package TncpJavaStudy;

import java.util.*;

public class Main0906 {

    public static void main(String[] args) {

//        10871번
//        Scanner sc = new Scanner(System.in);
//        System.out.print("배열에 몇 개의 수를 넣고 비교할 것인가? :");
//        int N = sc.nextInt();
//        System.out.print("비교할 수는 무엇인가? : ");
//        int X = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++){
//            arr[i] = sc.nextInt();
//            if(arr[i] < X){
//                System.out.print(arr[i]+" ");
//            }
//        }

//        10952번
//        Scanner sc = new Scanner(System.in);
//        // Scanner 객체 sc 선언
//        while (true)
//        // while 문 선언
//        {
//            int a = sc.nextInt();
//            // 값을 입력 받아 int a 변수에 저장
//            int b = sc.nextInt();
//            // 값을 입력 받아 int b 변수에 저장
//            if (a == 0 && b == 0) {
//                // if 문 선언
//                sc.close();
//                // 객체 sc 사용을 종료
//                break;
//                //if문을 빠져나감
//            }
//            System.out.println(a + b);
//            // a+b값을 출력
//        }

//        10951번
//        Scanner sc = new Scanner(System.in);
//
//        while (sc.hasNextInt()) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a + b);
//            if (!sc.hasNextInt()) {
//                // if 문 선언
//                sc.close();
//                // 객체 sc 사용을 종료
//                break;
//                //if문을 빠져나감
//            }
//            System.out.print(a + b);
//            // a+b값을 출력
//        }

//        1110번
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        sc.close();
//
//        int cnt = 0;
//        int copy = N;
//
//        while (true) {
//            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
//            cnt++;
//
//            if (copy == N) {
//                break;
//            }
//        }
//        System.out.println(cnt);

//        10818번
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        sc.close();
//        Arrays.sort(arr);
//        System.out.print(arr[0] + " " + arr[N - 1]);

//        2562번
//        Scanner sc = new Scanner(System.in);
//        int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
//                sc.nextInt(), sc.nextInt(), sc.nextInt(),
//                sc.nextInt(), sc.nextInt(), sc.nextInt() };
//        sc.close();
//
//        int count = 0;
//        int max = 0;
//        int index = 0;
//
//        for(int value : arr) {
//            count++;
//
//            if(value > max) {
//                max = value;
//                index = count;
//            }
//        }
//        System.out.print(max + "\n" + index);

//        3052번
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = new int[10];
//        boolean bl; //n번째와 n+1번째랑 비교하기 위한 변수
//        int cnt = 0; //서로 다른 나머지들의 개수를 측정하기 위한 변수
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt() % 42;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            bl = false; //기본값을 false로 설정
//            for (int k = i + 1; k < arr.length; k++) {
//                if (arr[i] == arr[k]) { //배열의 n번째와 n+1번째의 값을 비교
//                    bl = true; //같다면 bl값을 true로 변경
//                    break; //한번만 비교하면 되니 조건이 성립하면 벗어나기
//                }
//            }
//            if (bl == false) {
//                cnt++; //bl의 값이 false일 때 카운트를 1증가
//            } //만약 true면 나머지가 서로 같다는 뜻이니 카운트를 올릴 필요x
//        }
//        System.out.println(cnt);

//        1546번
//        Scanner sc = new Scanner(System.in);
//
//        double arr[] = new double[sc.nextInt()];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextDouble();
//        }
//        sc.close();
//
//        double sum = 0;
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += ((arr[i] / arr[arr.length - 1]) * 100);
//        }
//        System.out.print(sum / arr.length);

//        8958번
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        String OX = null;
//        int score = 0;
//
//        for (int i = 0; i < N; i++) {
//            int count = 0;
//            score = 0;
//            OX = sc.next();
//            for (int j = 0; j < OX.length(); j++) {
//                if (OX.charAt(j) == 'O') {
//                    count++;
//                    score = score + count;
//                } else if (OX.charAt(j) == 'X') {
//                    count = 0;
//                }
//            }
//            System.out.println(score);
//        }

//        4344번
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();   // 케이스수
        int[] arr;

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();	// 학생수
            arr = new int[n];

            int sum = 0;

            for(int j = 0; j < n; j++) {
                int point = sc.nextInt();
                arr[j] = point;
                sum += point;
            }

            double avg = (double)sum / n;
            double cnt = 0;

            for (int j = 0; j < n; j++) {
                if(arr[j] > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", cnt / n * 100);
        }

    }
}
