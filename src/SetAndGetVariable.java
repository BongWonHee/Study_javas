public class SetAndGetVariable {
    public static void main(String[] args) {

        int A = 1; //변수들의 값은 비교하여 true, false에 따라 변수값을 대채 한 값을 출력
        int B = 3;
        int C = 5;
        int D = 7;
        int E = 10;
        int F = 50;
        int G = 30;
        int H = 200;

        if (B == 3) {
            System.out.println(A = E);
        } else {
            System.out.println(C = 5);

        }
        System.out.println(A + "" + B +"" + C + "" + D + ""); //김명곤님 코드 참조함.
        if (D != 9) {
            System.out.println(B = C);
          
        }else{
            System.out.println(B = H);
        }
        System.out.println(A + "" + B +"" + C + "" + D + "");
        if(A == 10){
        System.out.println(C = F);
        } else{
            System.out.println(D = G );
        }
        System.out.println(A + "" + B +"" + C + "" + D + "");
        // retrue 0;

    }
}
