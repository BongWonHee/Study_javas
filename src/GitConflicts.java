public class GitConflicts {
    public static void main(String[] args) {
        try {
            int second = 1;
            int first = 0 ;
            second = first + 1 ;
            
            // int first = 2; // 중복 선언 제외
            first = first + 1 ;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }//return 0 ;
}
