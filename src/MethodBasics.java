import javax.naming.spi.DirStateFactory.Result;

public class MethodBasics {
    
    // <access_modifier> <return_type> <method_name>(list_of parameters){
    //     body
    // }
// x에 + 1
    public int F(int x) //return_data_type을 return의 변수 타입을 동일시 한다. 
    {
        int result = x + 1;
        
        return result; //출력하는 변수를 입력해준다.
    }

    // y의 메소드 과제
    
    public static void main(String[] args) {
        try {
            int y = 0;
            int x = 4;
            
            // y = x + 1; //변수에 +1
            // MethodBasics metehodBasics = new MethodBasics();
            // y = metehodBasics.F(x);
            // y = F(x);
            y = y + 1; //변수에 +1
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);
            y = methodBasics.F(y);
             
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0 ;

    }
}
