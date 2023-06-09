import java.util.ArrayList;

public class ClassArraylists {
    public static void main(String[] args) {
        try {

            ArrayList arrayList = new ArrayList(); //funtion을 통해서 값을 변경.
            arrayList.add(1);//true 값을 입력하는 것
            arrayList.add(2);//true
            arrayList.add(3);//true
            arrayList.size();//3 *사이즈를 확인.
            arrayList.get(2); //Integer@38 "3"  value: 3 * 값을 가져올때  값의 자리 번호를 입력.
            arrayList.set(1,5); //Integer@35 "2" 값을 변경할때 자리번호를 입력하고 바꿀 값을 입력
            arrayList.remove(0);//Integer@32 "1" 지우고 싶은 값을 지정할때 해당 자리 번호를 입력.
            arrayList.clear(); // 입력값 전체 비우기.
            System.out.println();

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        //retrun 0 ;
    }
    
}
