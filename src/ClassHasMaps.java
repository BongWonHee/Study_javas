import java.util.HashMap;

public class ClassHasMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("frist", 1);// null key값 문자 와 value 값 숫자를 입력 하여 값을 넣기
            hashMap.put("second", 2);// null
            hashMap.put("third", 3);// null
            hashMap.get("third");// Integer@52 "3" 키값으로 불러옴
            hashMap.size(); // 3 사이즈 확인
            hashMap.put("second", 5); // Integer@48 "2" 해당 키값을 넣고 변경할 value 입력.
            hashMap.remove("second");// Integer@60 "5" 지우고싶은 키값을 삭제 한다.
            hashMap.keySet();// HashMap$KeySet@66 size=2 0:"third"1:"frist" key값만 전체 확인할때.
            hashMap.values();// HashMap$Values@70 size=2 0:Integer@52 1:Integer@29 value값만 전체 확인할때.
            hashMap.clear(); // HashMap 을 비울때 사용
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // retrun 0;
    }
}
