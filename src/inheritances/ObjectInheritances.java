package inheritances;


public class ObjectInheritances extends Object{
    public int FirstMethods(String first){
        try {
            System.out.println("FirstMethods");
        } catch (Exception e) {
            System.out.println(e.getMessage());//오류 잡아줌
            // TODO: handle exception

        }
        return 0;
    }
}
