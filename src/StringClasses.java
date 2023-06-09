public class StringClasses {
public static void main(String[] args) {
    try {
        String name =  "Won Hee Bong";
        String name_second = new String("Cheol Su Kim");
        name.equalsIgnoreCase("Won Hee Bong");//true
        name.equalsIgnoreCase("Won Hee ");//false
        name_second.equalsIgnoreCase("Cheol Su Kim");// true 선언된 문자가 참으로 선언되었는지 확인한다.
        name_second.length();//12 선언된 문자의 길이 확인
        name_second = name_second.replaceAll("e", "a");//"Chaol Su Kim" 변경할 문자를 선언 후 대입할 문자를 선언한다.
        String[] arrays =  name_second.split(" "); //해당 기준으로 잘린 단어를 array로 출력하므로 array로 다시 지정해서 받는다.
        String name_substring = name_second.substring(2,11); //"aol Su Ki" 문자열을 잘라서 사용할때는 시작점, 끝점 사용
                                                                                
        System.out.println();
    } catch (Exception e) {
        // TODO: handle exception
    }
    System.out.println();
    //retrun 0 ;
}
}
