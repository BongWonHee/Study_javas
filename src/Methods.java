import javax.naming.spi.DirStateFactory.Result;

public class Methods {
    // <access_modifier> <return_type> <method_name>(list_of parameters){
    // body
    // }
    public int minus(int first, int second) {
        int result = 0;
        try {
            result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    public int add(int first, int second) {
        int result = 0;
        try {
            result = first + second;

        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    public static void main(String[] args) {
        // 인스턴스는 1회
        // 초기 값은 2를 넘지 않음.
        // 결과값은 17 이어야 한다.
        try {
            int x = 1;
            int y = 1;

            for (int i = 0; i < 16; i++) {

                Methods addpoint = new Methods();
                x = addpoint.add(x, y);

            }
            System.out.println(x);

        } catch (

        Exception e) {
            // TODO: handle exception
        } // return 0;
    }
}
