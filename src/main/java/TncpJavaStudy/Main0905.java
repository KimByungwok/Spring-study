package TncpJavaStudy;

import java.util.*;

public class Main0905 {

    public static void main(String[] args) {

//        2884번
//        Scanner sc = new Scanner(System.in);
//        int h = 0;
//        int m = 0;
//        int a = 0;
//
//        do {
//            System.out.print("시간 입력 : ");
//            h = sc.nextInt();
//        }while (h > 24);
//
//        do {
//            System.out.print("분 입력 : ");
//            m = sc.nextInt();
//        }while (m > 60);
//
//        a = m-45;
//        if (a < 0){
//            if (h == 0){
//                h = 24 - 1;
//                m = 60 + a;
//                System.out.println(h+"시"+m+"분");
//            }
//            h = h - 1;
//            m = 60 + a;
//            System.out.println(h+"시"+m+"분");
//        } else {
//            System.out.println(h+"시"+m+"분");
//        }

//        2525번
//        Scanner sc = new Scanner(System.in);
//        int h = 0;
//        int m = 0;
//        int c = 0;
//        int a = 0;
//
//        do {
//            System.out.print("현재 시간 입력 : ");
//            h = sc.nextInt();
//        } while (h > 24);
//
//        do {
//            System.out.print("현재 분 입력 : ");
//            m = sc.nextInt();
//        } while (m > 60);
//
//        do {
//            System.out.print("조리시간 입력 : ");
//            c = sc.nextInt();
//        } while (c > 1000 || c < 0);
//
//        a = m + c;
//        if (a > 60) {
//            m = a % 60;
//            a = (int) a / 60;
//            h = h + a;
//            if (h >= 24){
//                h = h - 24;
//            }
//            System.out.println(h + "시" + m + "분");
//        } else if (a < 60){
//            m = a;
//            System.out.println(h + "시" + m + "분");
//        }

//        2480번
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//        int b = 0;
//        int c = 0;
//
//        do {
//            System.out.print("1번 주사위 결과 (6이하의 숫자 입력) : ");
//            a = sc.nextInt();
//        }while (a > 6);
//        do {
//            System.out.print("2번 주사위 결과 (6이하의 숫자 입력) : ");
//            b = sc.nextInt();
//        }while (b > 6);
//        do {
//            System.out.print("3번 주사위 결과 (6이하의 숫자 입력) : ");
//            c = sc.nextInt();
//        }while (c > 6);
//
//        if (a == b && a==c){
//            System.out.println(10000+(a * 1000)+"원 획득!");
//        } else if(a == b || a ==c){
//            System.out.println(1000+(a)*100+"원 획득!!");
//        } else if (b == c) {
//            System.out.println(1000+(b)*100+"원 획득!!");
//        } else {
//            if(a > b && a > c){
//                System.out.println(a*100+"원 획득!!!");
//            }else if(b > a && b > c){
//                System.out.println(b*100+"원 획득!!!");
//            } else {
//                System.out.println(c*100+"원 획득!!!");
//            }
//        }

//        2739번
//        Scanner sc = new Scanner(System.in);
//        System.out.print("구구단 출력해줌 : ");
//        int a = sc.nextInt();
//
//        for(int i = 1; i <= 9; i++){
//            System.out.println(a+"*"+i+" : "+ a*i);
//        }
//
//        10950번
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        num = sc.nextInt();
//
//        int a[] = new int[num];
//        int b[] = new int[num];
//        System.out.println(num + "개 숫자들을 입력해라");
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("1번 숫자 입력 : ");
//            a[i] = sc.nextInt();
//            System.out.print("2번 숫자 입력 : ");
//            b[i] = sc.nextInt();
//        }
//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i] + b[i]);
//        }

//        8393번
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//        a = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= a; i++){
//            sum +=i;
//        }
//        System.out.println(sum);

//        25304번
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//        int b = 0;
//        int sum = 0;
//        int ca = 0;
//        int ab = 0;
//
//        System.out.print("총액 입력 : ");
//        sum = sc.nextInt();
//        System.out.print("종류의 갯수 : ");
//        ca = sc.nextInt();
//
//        for (int i=0; i < ca; i++){
//            System.out.print("금액 입력 : ");
//            a = sc.nextInt();
//            System.out.print("갯수 입력 : ");
//            b = sc.nextInt();
//            ab = ab + (a*b);
//        }
//        if (sum == ab){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

//        15552번
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int a = Integer.parseInt(br.readLine());
//            int b = Integer.parseInt(br.readLine());
//            br.close();
//            System.out.println((int)a+b);
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }

//        11021번
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        num = sc.nextInt();
//
//        int[] a = new int[num];
//        int[] b = new int[num];
//        System.out.println(num + "개 숫자들을 입력해라");
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("1번 숫자 입력 : ");
//            a[i] = sc.nextInt();
//            System.out.print("2번 숫자 입력 : ");
//            b[i] = sc.nextInt();
//        }
//        for (int i = 0; i < a.length; i++){
//            System.out.println("Case #"+(i+1)+" : "+a[i] + b[i]);
//        }

//        11022번
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        num = sc.nextInt();
//
//        int[] a = new int[num];
//        int[] b = new int[num];
//        System.out.println(num + "개 숫자들을 입력해라");
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("1번 숫자 입력 : ");
//            a[i] = sc.nextInt();
//            System.out.print("2번 숫자 입력 : ");
//            b[i] = sc.nextInt();
//        }
//        for (int i = 0; i < a.length; i++){
//            System.out.println("Case #"+(i+1)+" : "+a[i]+"+"+ b[i]+" : "+a[i]+b[i]);
//        }

//        2483번
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//        a = sc.nextInt();
//
//        for(int i =0; i <= a; i++){
//            for (int j = 0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        2439번
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//        a = sc.nextInt();
//
//        for(int i=0;i<=a;i++){
//            for(int j=a;j>0;j--){
//                if(i<j){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }

//        10817번
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        int num[] = new int[a];





    }
}
