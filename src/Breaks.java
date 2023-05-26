public class Breaks {

    public static void main(String[] args) {
        // try, catch문 사용
        try {
            // break문의 대한 사용법 알기
            for (int first = 0; first < 4; first = first + 1) {
                if (first == 2) { // first 값이 2이면 for문 종료
                    break;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println();

        } finally {
            System.out.println();

        }
        System.out.println();
        // return 0;;
    }

}
// break; 루핑하는 동안 해당 코드를 탈출 할때 사용한다.