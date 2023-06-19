package inheritances;

<<<<<<< HEAD
public class ObjectInheritances extends Object {
    public int FirstMethods(String first) {
        try {
            System.out.println("firstMethods");
        } catch (Exception e) {
            System.out.println(e.getMessage());
=======
public class ObjectInheritances extends Object{
    public int FirstMethods(String first){
        try {
            System.out.println("FirstMethods");
        } catch (Exception e) {
            System.out.println(e.getMessage());//오류 잡아줌
            // TODO: handle exception
>>>>>>> 602f04b426619bca4814fa2c2535241b7d68fcf2
        }
        return 0;
    }
}
