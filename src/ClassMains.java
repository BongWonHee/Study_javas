import cases.ClassSeconds;

public class ClassMains {

    public static void main(String[] args) {
        try {
            Classfirsts classfirsts = new Classfirsts(); //noparameter
            Classfirsts classfirstWithVar = new Classfirsts(5); //oneparameter
            int second = classfirstWithVar.getsecond();
            ClassSeconds classSeconds = new ClassSeconds(6);
            System.out.println();

        } catch (Exception e) {
            // TODO: handle exception
        } // return 0 ;
    }
}
