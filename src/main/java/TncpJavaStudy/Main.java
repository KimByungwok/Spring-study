package TncpJavaStudy;

import java.util.*;

public class Main {


    // 전역 변수 선언
    static int[] target;
    public static void main(String[] args) throws Exception {

//        1920번
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        target = new int[n];
        for (int i = 0; i < n; i++)
            target[i] = sc.nextInt();
        Arrays.sort(target);
//n개의 정수를 target 배열에 담은 후 Arrays.sort()를 통해 오름차순으로 정렬한다. (정렬은 이분 탐색을 위해 수행)
        int m = sc.nextInt();
//m개의 값을 입력받는데, 하나의 값을 입력받을 때마다 search() 함수를 호출하여 반환받은 값을 출력한다.
        for (int i = 0; i < m; i++) {
            int value = sc.nextInt();

            System.out.println(search(value, 0, n - 1));
        }
    }

    static int search(int value, int start, int end) {
        if (start > end) {
// 시작값이 끝 값 보다 클 경우 더 이상 탐색할 데이터가 없고 찾으려는 데이터 값이 없다고 판단하여 0 반환
            return 0;
        }
        int mid = (start + end) / 2;
// 이 값을 통해 중앙 값 할당
        if (target[mid] == value) {
//만약 운이 좋게 중앙 값이 찾고자 하는 값이라면 1 리턴
            return 1;
        } else if (value < target[mid]) {
// 중앙 값보다 찾는 값이 작으면 왼쪽을 탐색해야 하므로 -1 을 해서 search 함수 실행
            return search(value, start, mid - 1);
        } else {
// 중앙 값보다 찾는 값이 크면 오른쪽으로 탐색해야 하므로 +1로 search 함수를 실행해서 다시 찾는다
            return search(value, mid + 1, end);
        }
    }
}
