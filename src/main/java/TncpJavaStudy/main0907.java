package TncpJavaStudy;

public class main0907 {
    public static void main(String[] args) {
        //        9012번
//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//        Stack<Character> stack = new Stack();
//        String s = sc.nextLine();
//
//        for (int i = 0; i < t; i++) {
//            s = sc.nextLine();
//            for (int j = 0; j < s.length(); j++) {
//                char c = s.charAt(j);
//                if (stack.isEmpty()) stack.push(c);
//                else {
//                    if (c == ')') {
//                        if (stack.peek() == '(') {
//                            stack.pop();
//                        } else {
//                            stack.push(c);
//                        }
//                    } else { // (s.charAt(j) == '(')
//                        stack.push(c);
//                    }
//                }
//            }
//            if (stack.isEmpty()) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//            stack.clear();
//        }

//        10828번
//        Stack<Integer> stack = new Stack<Integer>();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("몇 개의 명령어를 입력할 것인가? : ");
//        int cnt = sc.nextInt();
//
//        for (int i = 0; i < cnt; i++) {
//            String incommend = sc.next();
//            if (incommend.contains("push")) { //contains를 쓰는 이유는 push 하고 뒤에 값을 입력하기 때문에 equals를 쓰면 오류 발생
//                int inpush = sc.nextInt();
//                stack.push(inpush);
//                System.out.println(inpush);
//            } else if (incommend.equals("pop")) {
//                if(stack.isEmpty()){
//                    System.out.println(-1);
//                }else {
//                    System.out.println(stack.pop());
//                }
//            } else if (incommend.equals("size")) {
//                System.out.println(stack.size());
//            } else if (incommend.equals("empty")) {
//                if(stack.isEmpty()){
//                    System.out.println(1);
//                }else {
//                    System.out.println(0);
//                }
//            } else if (incommend.equals("top")) {
//                if(stack.isEmpty()){
//                    System.out.println(-1);
//                }else {
//                    System.out.println(stack.peek());
//                }
//            }
//        }



    }
}
