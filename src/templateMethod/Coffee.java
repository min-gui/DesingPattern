package templateMethod;

import java.util.Scanner;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("커피 내리는중");
    }

    @Override
    void addCondiments() {
        System.out.println("우유 설탕 추가중");
    }

    @Override
    boolean customerWantsCondiments() {

        String answer =getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }

    public String getUserInput() {
        Scanner sc = new Scanner(System.in);
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣어 드릴까요?");
        answer = sc.nextLine();

        return answer == null ? "no" : answer;
    }
}
