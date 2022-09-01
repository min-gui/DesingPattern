package templateMethod.custom;

public class HomeKitchenTest {

    public static void main(String[] args) {
        Lamen lamen = new Lamen();
        lamen.execute();

        /* - 실행 결과
            냄비를 올린다.
            물을 넣는다.
            라면 스프와 면을 넣는다.
            냄비를 식탁으로 옮긴다.
        */

        KimchiSoup kimchiSoup = new KimchiSoup();
        kimchiSoup.execute();
        /* - 실행 결과
            냄비를 올린다.
            물을 넣는다.
            김치와 돼지고기를 넣는다.
            냄비를 식탁으로 옮긴다.
        */

        TunaSoup tunaSoup = new TunaSoup();
        tunaSoup.execute();
        /* - 실행 결과
            냄비를 올린다.
            물을 넣는다.
            김치와 참치를 넣는다.
            냄비를 식탁으로 옮긴다.
        */

        //유지보수 변경의용이.
        System.out.println("-----");
        HomeKitchen homeKitchen = new Lamen();
        homeKitchen.execute();

        homeKitchen = new KimchiSoup();
        homeKitchen.execute();

    }
}
