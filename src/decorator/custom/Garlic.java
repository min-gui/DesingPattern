package decorator.custom;

public class Garlic extends SecondMaterialDeco {

    private Pasta pasta;

    public Garlic(Pasta pasta) {
        this.pasta = pasta;
    }

    @Override
    public int cost() {
        return pasta.cost() + 1000;
    }

    @Override
    public String getName() {
        return pasta.getName() + " , 갈릭 추가";
    }
}
