public class SetAndGetVariable {
    public static void main(String[] args) {

        int A = 1;
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
        if (D != 9) {
            System.out.println(B = C);
          
        }else{
            System.out.println(B = H);
        }
        if(A == 10){
        System.out.println(C = F);
        } else{
            System.out.println(D = G );
        }
        // retrue 0;

    }
}
