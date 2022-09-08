package TncpJavaStudy;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Queue<Integer> queue = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);

        System.out.print("명령의 수 : ");
        int num = sc.nextInt();
        int last = 0;

        for (int i = 0; i < num; i++) {
            String commend = sc.next();
            if (commend.contains("push")) {
                int inpush = sc.nextInt();
                queue.add(inpush);
                last = inpush;
                System.out.println(inpush);
            } else if (commend.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.poll());
                }
            } else if (commend.equals("size")) {
                System.out.println(queue.size());
            } else if (commend.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (commend.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peek());
                }
            } else if (commend.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(last);
                }
            }

        }


    }
}
