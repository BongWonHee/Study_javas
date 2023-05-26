package cases;

import java.util.Scanner;

public class CasherFor {
    // 장바구니에 5개의 물품 가격을 입력하고 가격이 100원이 넘으면 초과 메시지를 생성하고, 0원으로 계산한다. 0을 입력하면 최종 가격을
    // 출력해준다.
    public static void main(String[] args) {

        Scanner myOjt = new Scanner(System.in);

        int[] price = new int[5];

        System.out.println("--- 계산 시작---");

        int money;

        for (int first = 0; first < price.length; first = first + 1) {
            money = myOjt.nextInt();

            if (money > 0 && money <= 100) {
                System.out.println("가격은" + money + "원 입니다.");
                // 가격이 0 이상이고 100보다 작거나 같으면 설정
                price[first] = money;
            } else if (money > 100) {
                System.out.println("가격 100원을 초과 하였습니다.");
                break;

                // 가격이 0 이거나 100을 초과하면 종료

            } else if (money == 0) {
                break;

            }
            money = 0;

        }
        System.out.println("--- 계산 종료 합니다.---");
        // 종료 후 총 입력된 수의 합을 출력한다.
        // 합을 저장할 변수 초기화
        System.out.println(price[0] + price[1] + price[2] + price[3] + price[4]);
        // 배열의 각 항을 순회하며 합을 구함

        // int sum = 0;
        // for (int i = 0; i < price.length; i++) {
        // sum += price[i];
        // }System.out.println("합계 : " + price);

    }

}
